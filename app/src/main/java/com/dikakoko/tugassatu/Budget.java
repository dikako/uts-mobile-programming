package com.dikakoko.tugassatu;


import android.os.Parcel;
import android.os.Parcelable;

public class Budget implements Parcelable {
    String deskripsi;
    double sisa, pemasukan, pengeluaran;

    public Budget(String deskripsi, double sisa, double pemasukan, double pengeluaran) {
        this.deskripsi = deskripsi;
        this.sisa = sisa;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
    }

    protected Budget(Parcel in) {
        deskripsi = in.readString();
        sisa = in.readDouble();
        pemasukan = in.readDouble();
        pengeluaran = in.readDouble();
    }

    public static final Creator<Budget> CREATOR = new Creator<Budget>() {
        @Override
        public Budget createFromParcel(Parcel in) {
            return new Budget(in);
        }

        @Override
        public Budget[] newArray(int size) {
            return new Budget[size];
        }
    };

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setPemasukan(double sisa) {
        this.pemasukan = pemasukan;
    }

    public double getPemasukan() {
        return pemasukan;
    }

    public void setPengeluaran(double pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public double getPengeluaran() {
        return pengeluaran;
    }

    public void setSisa(double sisa) {
        this.sisa = sisa;
    }

    public double getSisa() {
        return sisa;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.deskripsi);
        dest.writeDouble(this.sisa);
        dest.writeDouble(this.pemasukan);
        dest.writeDouble(this.pengeluaran);
    }
}
