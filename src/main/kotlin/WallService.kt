import java.lang.RuntimeException

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Пост не найден!")
    }

    fun add(post: Post): Post {
        var newId = posts.size + 1
        posts += post.copy(id = newId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val currentId = post.id
        for ((index) in posts.withIndex()) {
            if (posts[index].id == currentId) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

}

class PostNotFoundException(message: String) : RuntimeException(message)
