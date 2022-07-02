package com.practice.creational.factory;

public abstract class Computer {

    public abstract String getCPU();

    public abstract String getRAM();

    public abstract String getStorage();

    @Override
    public String toString() {
	return "RAM: " + getRAM() + ", CPU: " + getCPU() + ", Storage: " + getStorage();
    }
}
