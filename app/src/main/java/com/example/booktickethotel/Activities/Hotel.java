package com.example.booktickethotel.Activities;


import android.os.Parcel;
import android.os.Parcelable;

public class Hotel implements Parcelable {
    private String namaHotel,harga;
    public Hotel(){
    }
    public Hotel(String namaHotel, String harga){
        this.namaHotel = namaHotel;
        this.harga = harga;
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaHotel);
        dest.writeString(this.harga);
    }

    protected Hotel(Parcel in) {
        this.namaHotel = in.readString();
        this.harga = in.readString();
    }

    public static final Parcelable.Creator<Hotel> CREATOR = new Parcelable.Creator<Hotel>() {
        @Override
        public Hotel createFromParcel(Parcel source) {
            return new Hotel(source);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };
}
