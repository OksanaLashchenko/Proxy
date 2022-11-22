public class ProxyDownloader implements Downloader {

    private final Downloader downloader;

    private String cache;

    public ProxyDownloader(Downloader downloader) {
        this.downloader = downloader;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    @Override
    public String download() {
        if (cache == null) {
            cache = downloader.download();
        }
        return cache;
    }

}
