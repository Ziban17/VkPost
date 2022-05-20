data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comment = Comment(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reports = Reports(),
    val views: Views = Views(),
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAd: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut = Donut(),
    val postponedId: Int = 0,
)

data class Comment(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true,

    )

data class Copyright(
    val id: Int = 0,
    val link: String = "",
    val name: String = "",
    val type: String = "",
)

data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true,
)

data class Reports(
    val count: Int = 0,
    val userReposted: Boolean = true,
)

data class Views(
    val count: Int = 0,
)

data class Donut(
    val isDonut: Boolean = true,
    val paidDuration: Int = 0,
    val placeholder: String = "",
    val canPublishFreeCopy: Boolean = true,
    val editMode: String = "",
)