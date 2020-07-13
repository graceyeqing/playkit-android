package com.kaltura.playkit;

import android.net.Uri;

import com.kaltura.android.exoplayer2.offline.StreamKey;
import com.kaltura.android.exoplayer2.upstream.DataSource;
import com.kaltura.playkit.prefetch.PKCacheProvider;

import java.util.List;

public interface ExoCacheProvider extends PKCacheProvider {
    DataSource.Factory buildDataSourceFactory();
    List<StreamKey> getOfflineStreamKeys(Uri uri);
}
