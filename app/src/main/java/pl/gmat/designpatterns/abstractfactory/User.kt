package pl.gmat.designpatterns.abstractfactory

class UserGalleryFactory : GalleryFactory {

    override fun createGallery(): Gallery = UserGallery()

    override fun createRepository(): GalleryRepository = UserGalleryRepository()

    override fun createResult(): GalleryResult = UserGalleryResult()
}

class UserGallery : Gallery

class UserGalleryRepository : GalleryRepository

class UserGalleryResult : GalleryResult