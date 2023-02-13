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
    val comments: Comment? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
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
    var attachments: Array<Attachments> = emptyArray()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (views != other.views) return false
        if (postType != other.postType) return false
        if (signerId != other.signerId) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAd != other.markedAsAd) return false
        if (isFavorite != other.isFavorite) return false
        if (donut != other.donut) return false
        if (postponedId != other.postponedId) return false
        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + createdBy
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId
        result = 31 * result + replyPostId
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + (comments?.hashCode() ?: 0)
        result = 31 * result + (copyright?.hashCode() ?: 0)
        result = 31 * result + (likes?.hashCode() ?: 0)
        result = 31 * result + (reposts?.hashCode() ?: 0)
        result = 31 * result + (views?.hashCode() ?: 0)
        result = 31 * result + postType.hashCode()
        result = 31 * result + signerId
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAd.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + postponedId
        result = 31 * result + attachments.contentHashCode()
        return result
    }
}

data class Comment(
    val id: Int = 0,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val donut: CommentDonut? = null,
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Attachments? = null,
    val parentsStack: Array<Comment>? = null,
    val thread: CommentThread? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (donut != other.donut) return false
        if (replyToUser != other.replyToUser) return false
        if (replyToComment != other.replyToComment) return false
        if (attachments != other.attachments) return false
        if (parentsStack != null) {
            if (other.parentsStack == null) return false
            if (!parentsStack.contentEquals(other.parentsStack)) return false
        } else if (other.parentsStack != null) return false
        if (thread != other.thread) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + fromId
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + (donut?.hashCode() ?: 0)
        result = 31 * result + replyToUser
        result = 31 * result + replyToComment
        result = 31 * result + (attachments?.hashCode() ?: 0)
        result = 31 * result + (parentsStack?.contentHashCode() ?: 0)
        result = 31 * result + (thread?.hashCode() ?: 0)
        return result
    }
}

data class CommentDonut(
    val isDon: Boolean = false,
    val placeholder: String
)

data class CommentThread(
    val count: Int = 0,
    val items: Array<Comment>? = null,
    val canPost: Boolean = false,
    val isShowReplyButton: Boolean = false,
    val isGroupsCanPost: Boolean = false
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CommentThread

        if (count != other.count) return false
        if (items != null) {
            if (other.items == null) return false
            if (!items.contentEquals(other.items)) return false
        } else if (other.items != null) return false
        if (canPost != other.canPost) return false
        if (isShowReplyButton != other.isShowReplyButton) return false
        if (isGroupsCanPost != other.isGroupsCanPost) return false

        return true
    }

    override fun hashCode(): Int {
        var result = count
        result = 31 * result + (items?.contentHashCode() ?: 0)
        result = 31 * result + canPost.hashCode()
        result = 31 * result + isShowReplyButton.hashCode()
        result = 31 * result + isGroupsCanPost.hashCode()
        return result
    }
}

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

data class Reposts(
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

