/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.04.2017
  * @author 
  */

public class Auto {
  
  // Anfang Attribute
  private String kennzeichen;
  private String hersteller;
  private String farbe;
  // Ende Attribute
  
  public Auto(String kennzeichen, String hersteller, String farbe) {
    this.kennzeichen = kennzeichen;
    this.hersteller = hersteller;
    this.farbe = farbe;
  }
  

  
  // Anfang Methoden
  public String getHersteller() {
    return hersteller;
  }
  
  public void setHersteller(String hersteller) {
    this.hersteller = hersteller;
  }
  
  public String getFarbe() {
    return farbe;
  }
  
  public void setFarbe(String farbe) {
    this.farbe = farbe;
  }
  
  public String getKennzeichen() {
    return kennzeichen;
  }
  
  public void setKennzeichen(String kennzeichen) {
    this.kennzeichen = kennzeichen;
  }
  
  // Ende Methoden
} // end of uml
