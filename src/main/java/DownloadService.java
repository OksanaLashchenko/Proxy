public class DownloadService {

    private final ProxyDownloader proxyDownloader;

    public DownloadService(ProxyDownloader proxyDownloader) {
        this.proxyDownloader = proxyDownloader;
    }

    public String renderPage() {
        return proxyDownloader.download();
    }

}
