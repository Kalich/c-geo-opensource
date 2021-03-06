package cgeo.geocaching.maps.google;

import cgeo.geocaching.cgCoord;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.maps.interfaces.CachesOverlayItemImpl;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class GoogleCacheOverlayItem extends OverlayItem implements CachesOverlayItemImpl {
    final private CacheType cacheType;
    final private cgCoord coord;

    public GoogleCacheOverlayItem(final cgCoord coordinate, final CacheType type) {
        super(new GeoPoint(coordinate.getCoords().getLatitudeE6(), coordinate.getCoords().getLongitudeE6()), coordinate.getName(), "");

        this.cacheType = type;
        this.coord = coordinate;
    }

    public cgCoord getCoord() {
        return coord;
    }

    public CacheType getType() {
        return cacheType;
    }

}
