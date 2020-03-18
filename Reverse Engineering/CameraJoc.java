// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CameraJoc.java

import java.util.ArrayList;
import java.util.Vector;

public class CameraJoc extends Aplicatie
    implements Npc
{

    public CameraJoc()
    {
    }

    public boolean intraCameraJoc(int nr)
    {
        return false;
    }

    public void ieseCameraJoc(int i)
    {
    }

    public void setTurn(boolean flag)
    {
    }

    public int getTurn()
    {
        return 0;
    }

    public void setType(String s)
    {
    }

    public void setId(int i)
    {
    }

    public DungeonMaster dm;
    public ArrayList jucatori;
    public int currentTurn;
    public Vector myAplicatie;
    public Chat myChat;
}
