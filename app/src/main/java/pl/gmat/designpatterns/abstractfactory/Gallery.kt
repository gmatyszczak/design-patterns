package pl.gmat.designpatterns.abstractfactory

interface GalleryFactory {

    fun createGallery(): Gallery
    fun createRepository(): GalleryRepository
    fun createResult(): GalleryResult
}

interface Gallery

interface GalleryRepository

interface GalleryResult