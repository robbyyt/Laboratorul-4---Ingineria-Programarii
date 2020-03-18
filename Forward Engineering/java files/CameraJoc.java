import java.util.ArrayList;
import java.util.Vector;

public class CameraJoc extends Aplicatie  implements Npc {

  public DungeonMaster dm;

  public ArrayList<JucatorObisnuit> jucatori;

  public int currentTurn;

    public Vector  myAplicatie;
    public Chat myChat;

  public boolean intraCameraJoc(int  nr) {
  return false;
  }

  public void ieseCameraJoc(int nr) {
  }

  public void setTurn(boolean turn) {
  }

  public int getTurn() {
  return 0;
  }

  @Override
  public void setType(String type) {

  }

  @Override
  public void setId(int id) {

  }
}