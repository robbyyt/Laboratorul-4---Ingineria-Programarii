import java.util.ArrayList;
import java.util.Vector;

public class Aplicatie<Utilizator> implements Npc {

  private ArrayList<Chat> chat;

  public ArrayList<Utilizator> utilizatori;

  public ArrayList<CameraJoc> cameraJoc;

    public Vector  myUtilizatori;



  public boolean accesareInterfata() {
  return false;
  }

  public boolean login(String nume) {
  return false;
  }

  public void desfasurareTure() {
  }

  public ArrayList<CameraJoc> creareCameraJoc( CameraJoc cameraJoc) {
  return null;
  }



  @Override
  public void setType(String type) {

  }

  @Override
  public String getType() {
    return null;
  }

  @Override
  public void setId(int id) {

  }



  @Override
  public int getId() {
    return 0;
  }
}