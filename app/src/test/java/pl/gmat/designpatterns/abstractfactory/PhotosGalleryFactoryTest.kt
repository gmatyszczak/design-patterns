package pl.gmat.designpatterns.abstractfactory

import org.junit.Assert.assertTrue
import org.junit.Test

class PhotosGalleryFactoryTest {

    private val factory = PhotosGalleryFactory()

    @Test
    fun createGallery() {
        assertTrue(factory.createGallery() is PhotosGallery)
    }

    @Test
    fun createRepository() {
        assertTrue(factory.createRepository() is PhotosGalleryRepository)
    }

    @Test
    fun createResult() {
        assertTrue(factory.createResult() is PhotosGalleryResult)
    }
}