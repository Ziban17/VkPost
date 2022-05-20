class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        var newId = posts.size + 1
        posts += post.copy(id = newId)
        println(posts.last().id)
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
