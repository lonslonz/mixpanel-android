package com.mixpanel.android.mpmetrics;

/**
 * Stores global configuration options for the Mixpanel library.
 * May be overridden to achieve custom behavior.
 */
/* package */
public class MPConfig {
    // When we've reached this many track calls, flush immediately
    public static final int BULK_UPLOAD_LIMIT = 40;

    // Time interval in ms events/people requests are flushed at.
    public static final long FLUSH_RATE = 60 * 1000;

    // Remove events and people records that have sat around for this many milliseconds
    // on first initialization of the library. Default is 48 hours.
    // Must be reconfigured before the library is initialized for the first time.
    public static final int DATA_EXPIRATION = 1000 * 60 * 60 * 48;

    // Base url that track requests will be sent to. Events will be sent to /track
    // and people requests will be sent to /engage
    //public static final String BASE_ENDPOINT = "https://api.mixpanel.com";
    //public static String BASE_ENDPOINT = "https://10.200.116.69:8443/log";
    public static String BASE_ENDPOINT = "https://rake.skplanet.com:8443/log";
//    public static String DEV_BASE_ENDPOINT = "http://172.19.114.160:8000/log/";
    public static String DEV_BASE_ENDPOINT = "http://dev.rake.skplanet.com:8000/log/";
//    public static String DEV_BASE_ENDPOINT = "http://1.234.62.198:7100/log/";    

    // Fallback url on failure
    //public static final String FALLBACK_ENDPOINT = "http://api.mixpanel.com";
    //public static String FALLBACK_ENDPOINT = "http://10.200.116.69/log";
    public static String FALLBACK_ENDPOINT = "http://rake.skplanet.com:8000/log";
    public static String DEV_FALLBACK_ENDPOINT = "http://dev.rake.skplanet.com:8000/log/";
//    public static String DEV_FALLBACK_ENDPOINT = "http://1.234.62.198:7100/log/";

    // Time in milliseconds that the AnalyticsMessages thread must be idle for before it dies.
    // Must be reconfigured before the library is initialized for the first time.
    public static final int SUBMIT_THREAD_TTL = 60 * 1000;

    // Set to true to see lots of internal debugging logcat output.
    // This should be set to false in production builds
    // LONS
    public static boolean DEBUG = false;
    
    // LONS
    public static boolean TRUSTED_SERVER = false;
    // LONS
    public static int CONNECTION_TIMEOUT = 5000;
    public static int SO_TIMEOUT = 5000;


    public static String SENTINEL_REMOTE_SERVER = "http://211.110.43.80:8080";
//    public static String SENTINEL_REMOTE_SERVER = "http://sentinel.skplanet.co.kr:8080";
    
}
