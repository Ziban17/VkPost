import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post = service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))

        val result = post.id
        assertEquals(1,result)

    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))

        // создаём информацию об обновлении
        val update = Post(4, 0, 0, 0, 0, "", 0, 0,
            false, 0, false, false, false,
            false, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateFalse(){

        val service = WallService()
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))
        service.add(Post(0, 1, 1, 1, 1, "", 1, 1,
            true, 1, true, true, true,
            true, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1))

        // создаём информацию об обновлении
        val update = Post(10, 0, 0, 0, 0, "", 0, 0,
            false, 0, false, false, false,
            false, 1, "", "", "", 1,
            true, true, true, 1, true, 1,
            "", 1, true, true, true, true, true, true,
            true, 1, "", true, "", 1)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}