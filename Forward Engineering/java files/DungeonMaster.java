import java.util.ArrayList;
import java.util.Vector;

public class DungeonMaster extends  Utilizatori {

  public Utilizatori utilizator;

  public ArrayList<JucatorObisnuit> jucatori;

  public ArrayList<Npc> npcs;

    public Vector  myUtilizatori;

  public void configurareSetari() {
  }

  public int impuneLimitaJucatoriCamera() {
  return 0;
  }

  public int impuneLimitaJucatoriClasa() {
  return 0;
  }

  public boolean ichidereaJocului() {
  return false;
  }

  public void stabilireaOrdiniiJucatorilor() {
  }

  public void situatiaCurentaAJocului() {
  }

  public boolean verificareZar(Utilizatori jucator) {
  return false;
  }

  public void generateNpcs(String context) {
  }

}