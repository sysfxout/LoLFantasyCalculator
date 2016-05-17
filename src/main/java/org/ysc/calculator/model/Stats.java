package org.ysc.calculator.model;

import java.util.HashMap;
import java.util.Map;

public class Stats {

	private int k, d, a, cs;
	private boolean ka10;
	private int turret, dragon, baron;
	private boolean win, win30;
	private int triple, quadra, penta;
	private boolean fb;
	
	public void updateStats(){
		if(k >= 10 || a>=10)
			ka10 = true;
	}

	public void setKDA(int k, int d, int a){
		this.k = k;
		this.d = d;
		this.a = a;
	}
	
	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getCs() {
		return cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public boolean isKa10() {
		return ka10;
	}

	public void setKa10(boolean ka10) {
		this.ka10 = ka10;
	}

	public int getTurret() {
		return turret;
	}

	public void setTurret(int turret) {
		this.turret = turret;
	}

	public int getDragon() {
		return dragon;
	}

	public void setDragon(int dragon) {
		this.dragon = dragon;
	}

	public int getBaron() {
		return baron;
	}

	public void setBaron(int baron) {
		this.baron = baron;
	}

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public boolean isWin30() {
		return win30;
	}

	public void setWin30(boolean win30) {
		this.win30 = win30;
	}

	public int getTriple() {
		return triple;
	}

	public void setTriple(int triple) {
		this.triple = triple;
	}

	public int getQuadra() {
		return quadra;
	}

	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}

	public int getPenta() {
		return penta;
	}

	public void setPenta(int penta) {
		this.penta = penta;
	}

	public boolean isFb() {
		return fb;
	}

	public void setFb(boolean fb) {
		this.fb = fb;
	}

}
