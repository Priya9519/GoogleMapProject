package com.example.priya.googlemapproject.pojo;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;

/**
 * Created by priya on 21/9/17.
 */

public class DataModel {
    public DataModel(Marker marker, Polyline polyline) {
        this.marker = marker;
        this.polyline = polyline;
    }
    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

    Marker marker;
    Polyline polyline;
}
