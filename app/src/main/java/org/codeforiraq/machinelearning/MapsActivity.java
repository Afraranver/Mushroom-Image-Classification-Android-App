package org.codeforiraq.machinelearning;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private LatLng oys1 = new LatLng(5.856425, 102.017487);
    private LatLng oys2 = new LatLng(6.035946, 102.056564);
    private LatLng oys3 = new LatLng(1.492531, 103.741446);
    private LatLng oys4 = new LatLng(1.757453, 103.902229);
    private LatLng oys5 = new LatLng(2.342586, 102.604775);
    private LatLng oys6 = new LatLng(1.658165, 103.597529);
    private LatLng oys7 = new LatLng(2.884425, 101.723557 );
    private LatLng oys8 = new LatLng(3.435810, 101.657716 );
    private LatLng oys9 = new LatLng(2.662507, 101.603566);
    private LatLng oys10 = new LatLng(6.024496, 116.179042);
    private LatLng oys11 = new LatLng(3.406103, 103.268855);
    private LatLng oys12 = new LatLng(2.800032, 101.798936 );
    private LatLng oys13 = new LatLng(2.738003, 102.182316);
    private LatLng oys14 = new LatLng(1.452921, 110.485362 );
    private LatLng oys15 = new LatLng(1.124919, 111.672222);
    private LatLng shi1 = new LatLng(1.484450, 103.745331);
    private LatLng shi2 = new LatLng(5.787414, 100.435391);
    private LatLng shi3 = new LatLng(5.998547, 116.182733 );
    private LatLng shi4 = new LatLng(6.000370, 116.561877);
    private LatLng shi5 = new LatLng(4.493749, 101.404391);
    private LatLng but1 = new LatLng(1.501954, 103.726448 );
    private LatLng but2 = new LatLng(2.059912, 102.583571);
    private LatLng ktm1 = new LatLng(2.596015, 102.578493);
    private LatLng fm1 = new LatLng(4.481941, 101.392889);
    private LatLng hw1 = new LatLng(2.751725, 101.768426);
    private LatLng av1 = new LatLng(4.720978, 101.135116);
    private LatLng gm1 = new LatLng(5.951883, 116.564967);
    private LatLng cm1 = new LatLng(2.857141, 101.677798 );
    private LatLng cm2 = new LatLng(3.233110, 101.321580 );
    private LatLng cm3 = new LatLng(3.038165, 101.420742);
    private LatLng cm4 = new LatLng(1.559834, 110.333614 );
    private LatLng cm5 = new LatLng(2.412160, 111.860621 );
    private LatLng cm6 = new LatLng(3.653690, 113.840086 );
    private LatLng cm7 = new LatLng(3.140420, 113.030899);
    private LatLng cm8 = new LatLng(5.780900, 101.041900 );
    private LatLng cm9 = new LatLng(2.110960, 111.669021);
    private LatLng cm10 = new LatLng(5.329846, 115.746802 );
    private LatLng cm11 = new LatLng(5.341410, 116.254225 );
    private LatLng cm12 = new LatLng(5.696649, 116.413063 );
    private LatLng cm13 = new LatLng(4.899296, 115.912051);
    private LatLng cm14 = new LatLng(3.166195, 102.976610 );
    private LatLng cm15 = new LatLng(3.389351, 102.430394 );
    private LatLng cm16 = new LatLng(3.516759, 101.928527 );
    private LatLng cm17 = new LatLng(3.478644, 102.470559);






    private Marker moys1;
    private Marker moys2;
    private Marker moys3;
    private Marker moys4;
    private Marker moys5;
    private Marker moys6;
    private Marker moys7;
    private Marker moys8;
    private Marker moys9;
    private Marker moys10;
    private Marker moys11;
    private Marker moys12;
    private Marker moys13;
    private Marker moys14;
    private Marker moys15;
    private Marker mshi1;
    private Marker mshi2;
    private Marker mshi3;
    private Marker mshi4;
    private Marker mshi5;
    private Marker mbut1;
    private Marker mbut2;
    private Marker mktm1;
    private Marker mfm1;
    private Marker mhw1;
    private Marker mav1;
    private Marker mgm1;
    private Marker mcm1;
    private Marker mcm2;
    private Marker mcm3;
    private Marker mcm4;
    private Marker mcm5;
    private Marker mcm6;
    private Marker mcm7;
    private Marker mcm8;
    private Marker mcm9;
    private Marker mcm10;
    private Marker mcm11;
    private Marker mcm12;
    private Marker mcm13;
    private Marker mcm14;
    private Marker mcm15;
    private Marker mcm16;
    private Marker mcm17;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        BottomNavigationView bnv = findViewById(R.id.bot_nav);
        bnv.setSelectedItemId(R.id.home);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), StartActivity.class));
                        overridePendingTransition(0,0);
                        return  true;
                    case R.id.kym:
                        startActivity(new Intent(getApplicationContext(),kym.class));
                        overridePendingTransition(0,0);
                        return  true;
                    case R.id.wtf:
                        startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                        overridePendingTransition(0,0);
                        return  true;


                }
                return false;
            }
        });



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        List<Marker> markerList = new ArrayList<>();
        moys1 = mMap.addMarker(new MarkerOptions().position(oys1).title("Kelantan, tanah merah(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys1.setTag(0);
        markerList.add(moys1);

        moys2 = mMap.addMarker(new MarkerOptions().position(oys2).title("Kelantan, pasir mas(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys2.setTag(0);
        markerList.add(moys2);

        moys3 = mMap.addMarker(new MarkerOptions().position(oys3).title("Johor, JB(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys3.setTag(0);
        markerList.add(moys3);

        moys4 = mMap.addMarker(new MarkerOptions().position(oys4).title("Johor, kota tinggi(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys4.setTag(0);
        markerList.add(moys4);

        moys5 = mMap.addMarker(new MarkerOptions().position(oys5).title("Johor, ledang(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys5.setTag(0);
        markerList.add(moys5);

        moys6 = mMap.addMarker(new MarkerOptions().position(oys6).title("Johor, kulai(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys6.setTag(0);
        markerList.add(moys6);

        moys7 = mMap.addMarker(new MarkerOptions().position(oys7).title("KSelangor, Jenderam(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys7.setTag(0);
        markerList.add(moys7);

        moys8 = mMap.addMarker(new MarkerOptions().position(oys8).title("Selangor, kalong tengah(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys8.setTag(0);
        markerList.add(moys8);

        moys9 = mMap.addMarker(new MarkerOptions().position(oys9).title("Selangor, tanjong sepat(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys9.setTag(0);
        markerList.add(moys9);

        moys10 = mMap.addMarker(new MarkerOptions().position(oys10).title("Sabah, kota Kinabalu(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys10.setTag(0);
        markerList.add(moys10);

        moys11 = mMap.addMarker(new MarkerOptions().position(oys11).title("Pahang, pekan(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys11.setTag(0);
        markerList.add(moys11);

        moys12 = mMap.addMarker(new MarkerOptions().position(oys12).title("Negeri sembilan, nilai(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys12.setTag(0);
        markerList.add(moys12);

        moys13 = mMap.addMarker(new MarkerOptions().position(oys13).title("Negeri sembilan, tanjong ipoh(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys13.setTag(0);
        markerList.add(moys13);

        moys14 = mMap.addMarker(new MarkerOptions().position(oys14).title("Sarawak, kota samarahan(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys14.setTag(0);
        markerList.add(moys14);

        moys15 = mMap.addMarker(new MarkerOptions().position(oys15).title("Sarawak, engkelili(Oyster Mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        moys15.setTag(0);
        markerList.add(moys15);

        mshi1 = mMap.addMarker(new MarkerOptions().position(shi1).title("Johor, JB(Shiitake mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mshi1.setTag(0);
        markerList.add(mshi1);

        mshi2 = mMap.addMarker(new MarkerOptions().position(shi2).title("Kedah, gunung jerai(Shiitake mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mshi2.setTag(0);
        markerList.add(mshi2);

        mshi3 = mMap.addMarker(new MarkerOptions().position(shi3).title("Sabah, kota kinabalu(Shiitake mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mshi3.setTag(0);
        markerList.add(mshi3);

        mshi4 = mMap.addMarker(new MarkerOptions().position(shi4).title("Sabah, kundasang(Shiitake mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mshi4.setTag(0);
        markerList.add(mshi4);

        mshi5 = mMap.addMarker(new MarkerOptions().position(shi5).title("Pahang, cameron highlands(Shiitake mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mshi5.setTag(0);
        markerList.add(mshi5);

        mbut1 = mMap.addMarker(new MarkerOptions().position(but1).title("Johor, JB(Button mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mbut1.setTag(0);
        markerList.add(mbut1);

        mbut2 = mMap.addMarker(new MarkerOptions().position(but2).title("Johor, muar(Button mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mbut2.setTag(0);
        markerList.add(mbut2);

        mktm1 = mMap.addMarker(new MarkerOptions().position(ktm1).title("Negeri sembilan, gemas(King trumpet mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mktm1.setTag(0);
        markerList.add(mktm1);

        mfm1 = mMap.addMarker(new MarkerOptions().position(fm1).title("Pahang, cameron highlands(Field mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mfm1.setTag(0);
        markerList.add(mfm1);

        mhw1 = mMap.addMarker(new MarkerOptions().position(hw1).title("Negeri sembilan, bandar enstek(Hen of the Woods mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mhw1.setTag(0);
        markerList.add(mhw1);

        mav1 = mMap.addMarker(new MarkerOptions().position(av1).title("Perak, Chemor(Amanita virosa mushroom)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mav1.setTag(0);
        markerList.add(mav1);

        mgm1 = mMap.addMarker(new MarkerOptions().position(gm1).title("Sabah, kundasang(Galerina marginata)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mgm1.setTag(0);
        markerList.add(mgm1);

        mcm1 = mMap.addMarker(new MarkerOptions().position(cm1).title("Selangor: dengkil(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm1.setTag(0);
        markerList.add(mcm1);

        mcm2 = mMap.addMarker(new MarkerOptions().position(cm2).title("Selangor, jeram(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm2.setTag(0);
        markerList.add(mcm2);

        mcm3 = mMap.addMarker(new MarkerOptions().position(cm3).title("Selangor, klang(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm3.setTag(0);
        markerList.add(mcm3);

        mcm4 = mMap.addMarker(new MarkerOptions().position(cm4).title("Sarawak, kuching(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm4.setTag(0);
        markerList.add(mcm4);

        mcm5 = mMap.addMarker(new MarkerOptions().position(cm5).title("Sarawak, sibu(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm5.setTag(0);
        markerList.add(mcm5);

        mcm6 = mMap.addMarker(new MarkerOptions().position(cm6).title("Sarawak, miri(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm6.setTag(0);
        markerList.add(mcm6);

        mcm7 = mMap.addMarker(new MarkerOptions().position(cm7).title("Sarawak, bintulu(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm7.setTag(0);
        markerList.add(mcm7);

        mcm8 = mMap.addMarker(new MarkerOptions().position(cm8).title("Sarawak, betong(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm8.setTag(0);
        markerList.add(mcm8);

        mcm9 = mMap.addMarker(new MarkerOptions().position(cm9).title("Sarawak, bintangor(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm9.setTag(0);
        markerList.add(mcm9);

        mcm10 = mMap.addMarker(new MarkerOptions().position(cm10).title("Sabah, beaufort(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm10.setTag(0);
        markerList.add(mcm10);

        mcm11 = mMap.addMarker(new MarkerOptions().position(cm11).title("Sabah, keningau(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm11.setTag(0);
        markerList.add(mcm11);

        mcm12 = mMap.addMarker(new MarkerOptions().position(cm12).title("Sabah, tambunan(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm12.setTag(0);
        markerList.add(mcm12);

        mcm13 = mMap.addMarker(new MarkerOptions().position(cm13).title("Sabah, kecil kemabong(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm13.setTag(0);
        markerList.add(mcm13);

        mcm14 = mMap.addMarker(new MarkerOptions().position(cm14).title("Pahang, bukit ibam(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm14.setTag(0);
        markerList.add(mcm14);

        mcm15 = mMap.addMarker(new MarkerOptions().position(cm15).title("Pahang, kampung lebak(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm15.setTag(0);
        markerList.add(mcm15);

        mcm16 = mMap.addMarker(new MarkerOptions().position(cm16).title("Pahang, bentong(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm16.setTag(0);
        markerList.add(mcm16);

        mcm17 = mMap.addMarker(new MarkerOptions().position(cm17).title("Pahang, temerloh(Cholorophyllum Molybdites)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mcm17.setTag(0);
        markerList.add(mcm17);





        // Add a marker in Sydney and move the camera
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        /*LatLng oys = new LatLng(5.856425, 102.017487);
        mMap.addMarker(new MarkerOptions().position(oys)
                .title("Kelantan, tanah merah(Oyster Mushroom)"))
                .setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oys, 6));

         */

        for(Marker m : markerList) {
            LatLng latLng = new LatLng(m.getPosition().latitude, m.getPosition().longitude);
            mMap.addMarker(new MarkerOptions().position(latLng));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 5));


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dotmenu, menu);
        return true;

        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    public void onBackPressed(){
        startActivity(new Intent (getApplicationContext(), StartActivity.class));
        finish();

    }
}