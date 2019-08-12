package com.tutorials.hp.masterdetailrecyclerview.mData;

import com.tutorials.hp.masterdetailrecyclerview.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class SpaceCraftsCollection {

    public static ArrayList<SpaceCraft> getSpaceCrafts()
    {
        ArrayList<SpaceCraft> spaceCrafts=new ArrayList<>();
        SpaceCraft spaceCraft=null;

        //ADD DATA TO COLLECTION
        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Pioneer");
        spaceCraft.setImage(R.drawable.bunaken);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Enterprise");
        spaceCraft.setImage(R.drawable.bromo);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Hubble");
        spaceCraft.setImage(R.drawable.emeru);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Voyager");
        spaceCraft.setImage(R.drawable.eribu);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Spitzer");
        spaceCraft.setImage(R.drawable.mangrove);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Opportunity");
        spaceCraft.setImage(R.drawable.toba);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Apollo");
        spaceCraft.setImage(R.drawable.terjun);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Kepler");
        spaceCraft.setImage(R.drawable.kelimutu);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Columbia");
        spaceCraft.setImage(R.drawable.raja);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Challenger");
        spaceCraft.setImage(R.drawable.kuta);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Rosetta");
        spaceCraft.setImage(R.drawable.komodo);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("WMAP");
        spaceCraft.setImage(R.drawable.ujung);
        spaceCrafts.add(spaceCraft);


        //RETURN COLLECTION
        return spaceCrafts;
    }

}
