package com.imlabworld.p079a;

import java.util.Arrays;

public class SensorPacket {
    private int forceH;
    private int forceS;
    private int force;
    private double[] accDepthMin = new double[3];
    private double[] accDepthMax = new double[3];
    private int atm;
    private int posRaw;
    private boolean[] pos = new boolean[4];
    private byte[] accRaw = new byte[3];
    private double[] acc = new double[3];

    public SensorPacket(int forceH, int forceS, int force, double[] accDepthMin, double[] accDepthMax, int atm, int posRaw, boolean[] pos, byte[] accRaw, double[] acc) {
        this.forceH = forceH;
        this.forceS = forceS;
        this.force = force;
        this.accDepthMin = accDepthMin;
        this.accDepthMax = accDepthMax;
        this.atm = atm;
        this.posRaw = posRaw;
        this.pos = pos;
        this.accRaw = accRaw;
        this.acc = acc;
    }

    public int getForceH() {
        return this.forceH;
    }

    public int getForceS() {
        return this.forceS;
    }

    public int getForce() {
        return this.force;
    }

    public double[] getAccDepthMin() {
        return this.accDepthMin;
    }

    public void getPosRaw(int i) {
        this.posRaw = i;
    }

    public double[] getAccDepthMax() {
        return this.accDepthMax;
    }

    public int getAtm() {
        return this.atm;
    }

    public int getPosRaw() {
        return this.posRaw;
    }

    public boolean[] getPos() {
        return this.pos;
    }

    public byte[] getAccRaw() {
        return this.accRaw;
    }

    public double[] getAcc() {
        return this.acc;
    }

    public String toString() {
        return "SensorPacket [force_h=" + this.forceH + ", force_s=" + this.forceS + ", force=" + this.force + ", acc_depth_min=" + Arrays.toString(this.accDepthMin) + ", acc_depth_max=" + Arrays.toString(this.accDepthMax) + ", atm=" + this.atm + ", pos_raw=" + this.posRaw + ", pos=" + Arrays.toString(this.pos) + ", acc_raw=" + Arrays.toString(this.accRaw) + ", acc=" + Arrays.toString(this.acc) + "]";
    }
}
