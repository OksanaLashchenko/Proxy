public class Main {

    public static void main(String[] args) {
        Downloader downloader = new SimpleDownloader();

        ProxyDownloader notCached = new ProxyDownloader(downloader);
        DownloadService service1 = new DownloadService(notCached);
        System.out.println(service1.renderPage());

        ProxyDownloader cached = new ProxyDownloader(downloader);
        cached.setCache("Cached information downloaded");
        DownloadService service2 = new DownloadService(cached);
        System.out.println(service2.renderPage());
    }

}
