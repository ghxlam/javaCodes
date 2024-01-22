/**
Ghulam Ahmed
Summer 2022
CS-113
Section 121
Assignment 4
*/

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

class Satellite {
   private String name, tle_1, tle_2;
   
   public Satellite(String name, String tle_1, String tle_2) {
      this.name = name;
      this.tle_1 = tle_1;
      this.tle_2 = tle_2;
   }
   
   public String name() {
      return name;
   }
   
   public String cat_num() {
      return tle_1.substring(3,7);
   }
   
   public double mean_motion() {
      return Double.valueOf(tle_2.substring(53,63));
   }
   
   public double inclination() {
      return Double.valueOf(tle_2.substring(9,16));
   }
   
   public double eccentricity() {
      String ecc = "0." + tle_2.substring(27,33);
      return Double.valueOf(ecc);
   }
   
   public int launch_year() {
      String launch = tle_1.substring(10,11);
      int ly = Integer.parseInt(launch);
      if( ly < 57 && ly >= 00) 
         return 2000 + ly;
      else 
         return 1900 + ly;
   }
   
   public double perigee() {
      double n0 = this.mean_motion();
      double a = (8681663.653 / n0);
      a = Math.pow(a, (2.0/3.0));
      double e0 = this.eccentricity();
      double hp = a * (1 - e0) - 6371;
      return hp;
   }
   
   public double apogee() {
      double n0 = this.mean_motion();
      double a = (8681663.653 / n0);
      a = Math.pow(a, (2.0/3.0));
      double e0 = this.eccentricity();
      double ha = a * (1 + e0) - 6371;
      return ha;
   }
   
}

class SatelliteDemo2 {
   public static void main(String[] args) throws Exception {
      URL satellite = new URL("https://celestrak.org/NORAD/elements/gp.php?GROUP=visual&FORMAT=tle");
      BufferedReader in = new BufferedReader(new InputStreamReader(satellite.openStream()));
      
      String exName, exTle_1, exTle_2;
      List<Satellite> satData = new ArrayList<>();
      
      while((exName = in.readLine()) != null) {
         exTle_1 = in.readLine();
         exTle_2 = in.readLine();
         satData.add(new Satellite(exName, exTle_1, exTle_2));
      }
      try {
         File out_file = get_file();
         BufferedWriter writer = new BufferedWriter(new FileWriter(out_file));
         for(Satellite s : satData) {
            System.out.println("Name: " + s.name() + "\n"
                           + "Catalog Number: " + s.cat_num() + "\n"
                           + "Launch Year: " + s.launch_year() + "\n"
                           + "Apogee: " + s.apogee() + "\n"
                           + "Perigee: " + s.perigee() + "\n");
                           
            writer.write("Name: " + s.name() + "\n"
                           + "Catalog Number: " + s.cat_num() + "\n"
                           + "Launch Year: " + s.launch_year() + "\n"
                           + "Apogee: " + s.apogee() + "\n"
                           + "Perigee: " + s.perigee() + "\n");
         }
         writer.close();
      }
      catch (IOException e) {
         System.out.println("Unable to open file");
      }        
      System.out.println("Done"); 
   }
   
   private static File get_file() {
          JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
          int returnVal = fc.showOpenDialog(new JPanel());
          if (returnVal == JFileChooser.APPROVE_OPTION) 
            return fc.getSelectedFile();
           else
            return null;       
   }
    
   
}