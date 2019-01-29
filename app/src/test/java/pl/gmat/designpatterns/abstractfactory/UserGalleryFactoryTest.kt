package pl.gmat.designpatterns.abstractfactory

import org.junit.Assert.assertTrue
import org.junit.Test

class UserGalleryFactoryTest {

    private val factory = UserGalleryFactory()

    @Test
    fun createGallery() {
        assertTrue(factory.createGallery() is UserGallery)
    }

    @Test
    fun createRepository() {
        assertTrue(factory.createRepository() is UserGalleryRepository)
    }

    @Test
    fun createResult() {
        assertTrue(factory.createResult() is UserGalleryResult)
    }
}