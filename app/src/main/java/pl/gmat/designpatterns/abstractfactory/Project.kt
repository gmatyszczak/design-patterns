package pl.gmat.designpatterns.abstractfactory

class ProjectGalleryFactory : GalleryFactory {

    override fun createGallery(): Gallery = ProjectGallery()

    override fun createRepository(): GalleryRepository = ProjectGalleryRepository()

    override fun createResult(): GalleryResult = ProjectGalleryResult()
}

class ProjectGallery : Gallery

class ProjectGalleryRepository : GalleryRepository

class ProjectGalleryResult : GalleryResult