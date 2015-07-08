/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P.I.M;

import android.location.Location;

/**
 *
 * @author Nightstalker
 */
public class BLocation {
    // initialize vars
    private final String bname;
    private final Location blocation;
    private int id;
    private final String bdescription;
    private final int btourid;
    // end intialize vars

    /**
     *
     * @param bname
     * @param blocation
     * @param bdescription
     * @param btourid
     */
        public BLocation(String bname, Location blocation, String bdescription, int btourid)
    {
        this.bname = bname;
        this.blocation = blocation;
        this.bdescription = bdescription;
        this.btourid = btourid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.bname != null ? this.bname.hashCode() : 0);
        hash = 73 * hash + (this.blocation != null ? this.blocation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BLocation other = (BLocation) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public String getBname() {
        return bname;
    }

    /**
     *
     * @return
     */
    public Location getBlocation() {
        return blocation;
    }

    /**
     *
     * @return
     */
    public String getBdescription() {
        return bdescription;
    }

    /**
     *
     * @return
     */
    public int getBtourid() {
        return btourid;
    }
    
}
