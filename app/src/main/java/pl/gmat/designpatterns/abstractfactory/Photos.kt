package pl.gmat.designpatterns.abstractfactory

class PhotosGalleryFactory : GalleryFactory {

    override fun createGallery(): Gallery = PhotosGallery()

    override fun createRepository(): GalleryRepository = PhotosGalleryRepository()

    override fun createResult(): GalleryResult = PhotosGalleryResult()
}

class PhotosGallery : Gallery

class PhotosGalleryRepository : GalleryRepository

class PhotosGalleryResult : GalleryResult