import java.util.Vector;

public class DungeonMaster extends Utilizatori {

  public Utilizator utilizator;

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

  public boolean verificareZar( jucator) {
  return false;
  }

  public void generateNpcs( context) {
  }

}