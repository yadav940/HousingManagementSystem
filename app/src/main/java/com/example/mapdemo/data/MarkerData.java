package com.example.mapdemo.data;

import java.util.ArrayList;
import java.util.List;

public class MarkerData {
    public List<Data> listMarker;

    public MarkerData() {
        listMarker = new ArrayList<Data>();
        listMarker.add(new Data(26.4711,73.1134,"House-1"));
        listMarker.add(new Data(26.4811,73.1234,"House-2"));
        listMarker.add(new Data(26.4911,73.1334,"House-3"));
        listMarker.add(new Data(26.1011,73.1434,"House-4"));

    }
}
