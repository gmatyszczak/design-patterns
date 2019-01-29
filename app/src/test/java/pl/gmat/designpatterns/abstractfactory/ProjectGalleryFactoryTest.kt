package pl.gmat.designpatterns.abstractfactory

import org.junit.Assert.assertTrue
import org.junit.Test

class ProjectGalleryFactoryTest {

    private val factory = ProjectGalleryFactory()

    @Test
    fun createGallery() {
        assertTrue(factory.createGallery() is ProjectGallery)
    }

    @Test
    fun createRepository() {
        assertTrue(factory.createRepository() is ProjectGalleryRepository)
    }

    @Test
    fun createResult() {
        assertTrue(factory.createResult() is ProjectGalleryResult)
    }
}