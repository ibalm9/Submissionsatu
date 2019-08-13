package com.tutorials.hp.masterdetailrecyclerview.mData;

import com.tutorials.hp.masterdetailrecyclerview.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class TempatWisataData {

    public static ArrayList<TempatWisata> getSpaceCrafts()
    {
        ArrayList<TempatWisata> tempatWisatas =new ArrayList<>();
        TempatWisata tempatWisata =null;

        //ADD DATA TO COLLECTION
        tempatWisata =new TempatWisata();
        tempatWisata.setName("Taman Nasional Bunaken");
        tempatWisata.setKota("Pioneer");
        tempatWisata.setAlamat("");
        tempatWisata.setDaerah("");
        tempatWisata.setDeskripsi("");
        tempatWisata.setEmail("");
        tempatWisata.setJarak("");
        tempatWisata.setKomentar("");
        tempatWisata.setNomortelp("");
        tempatWisata.setRating("");
        tempatWisata.setSuka("");
        tempatWisata.setReviewer("");
        tempatWisata.setWebsite("");
        tempatWisata.setTipe("");
        tempatWisata.setImage(R.drawable.bunaken);
        tempatWisatas.add(tempatWisata);


        tempatWisata =new TempatWisata();
        tempatWisata.setName("Enterprise");
        tempatWisata.setImage(R.drawable.bromo);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Hubble");
        tempatWisata.setImage(R.drawable.emeru);
        tempatWisatas.add(tempatWisata);


        tempatWisata =new TempatWisata();
        tempatWisata.setName("Voyager");
        tempatWisata.setImage(R.drawable.eribu);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Spitzer");
        tempatWisata.setImage(R.drawable.mangrove);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Opportunity");
        tempatWisata.setImage(R.drawable.toba);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Apollo");
        tempatWisata.setImage(R.drawable.terjun);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Kepler");
        tempatWisata.setImage(R.drawable.kelimutu);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Columbia");
        tempatWisata.setImage(R.drawable.raja);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Challenger");
        tempatWisata.setImage(R.drawable.kuta);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("Rosetta");
        tempatWisata.setImage(R.drawable.komodo);
        tempatWisatas.add(tempatWisata);

        tempatWisata =new TempatWisata();
        tempatWisata.setName("WMAP");
        tempatWisata.setImage(R.drawable.ujung);
        tempatWisatas.add(tempatWisata);


        //RETURN COLLECTION
        return tempatWisatas;
    }

}
