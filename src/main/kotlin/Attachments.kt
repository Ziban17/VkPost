interface Attachments {
    val type: String
}

class VideoAttachment(override val type: String, val video: Video) : Attachments
data class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val description: String = "",
    val duration: Int = 0,
    val photo130: String = "",
    val photo320: String = "",
    val photo640: String = "",
    val photo800: String = "",
    val photo1280: String = "",
    val firstFrame130: String = "",
    val firstFrame320: String = "",
    val firstFrame640: String = "",
    val firstFrame800: String = "",
    val firstFrame1280: String = "",
    val date: Int = 0,
    val addingDate: Int = 0,
    val views: Int = 0,
    val comments: Int = 0,
    val player: String = "",
    val platform: String = "",
    val canEdit: Boolean = false,
    val canAdd: Boolean = false,
    val accessKey: String = "",
    val isProcessing: Boolean = false,
    val isLive: Boolean = false,
    val isUpcoming: Boolean = false,
    val isFavorite: Boolean = false
)


class PhotoAttachment(override val type: String, val photo: Photo) : Attachments
data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "",
    val date: Int = 0,
    val size: PhotoSize? = null,
    val width: Int = 0,
    val height: Int = 0

)

data class PhotoSize(
    val type: String = "",
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0
)

class DocAttachment(override val type: String, val doc: Doc) : Attachments
data class Doc(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val size: Int = 0,
    val ext: String = "",
    val url: String = "",
    val date: Int = 0,
    val type: Int = 0
)

class StickerAttachment(override val type: String, val sticker: Sticker) : Attachments
data class Sticker(
    val productId: Int = 0,
    val stickerId: Int = 0,
    val images: StickerImages?,
    val imagesWithBackground: StickerImagesWithBackground?
)

data class StickerImages(
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0
)

data class StickerImagesWithBackground(
    val url: String = "",
    val width: Int = 0,
    val height: Int = 0
)

class PoolAttachment(override val type: String, val pool: Pool) : Attachments
data class Pool(
    val id: Int = 0,
    val ownerId: Int = 0,
    val created: Int = 0,
    val question: String = "",
    val votes: Int = 0,
    val answers: PoolAnswers?,
    val isAnonymous: Boolean = false,
    val isMultiple: Boolean = false,
    val answersIds: Array<Int> = emptyArray(),
    val endDate: Int = 0,
    val isClosed: Boolean = false,
    val isBoard: Boolean = false,
    val canEdit: Boolean = false,
    val canVote: Boolean = false,
    val canReport: Boolean = false,
    val canShare: Boolean = false,
    val authorId: Int = 0,
    val photo: Photo?,
    val background: PoolBackground?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pool

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (created != other.created) return false
        if (question != other.question) return false
        if (votes != other.votes) return false
        if (answers != other.answers) return false
        if (isAnonymous != other.isAnonymous) return false
        if (isMultiple != other.isMultiple) return false
        if (!answersIds.contentEquals(other.answersIds)) return false
        if (endDate != other.endDate) return false
        if (isClosed != other.isClosed) return false
        if (isBoard != other.isBoard) return false
        if (canEdit != other.canEdit) return false
        if (canVote != other.canVote) return false
        if (canReport != other.canReport) return false
        if (canShare != other.canShare) return false
        if (authorId != other.authorId) return false
        if (photo != other.photo) return false
        if (background != other.background) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + created
        result = 31 * result + question.hashCode()
        result = 31 * result + votes
        result = 31 * result + (answers?.hashCode() ?: 0)
        result = 31 * result + isAnonymous.hashCode()
        result = 31 * result + isMultiple.hashCode()
        result = 31 * result + answersIds.contentHashCode()
        result = 31 * result + endDate
        result = 31 * result + isClosed.hashCode()
        result = 31 * result + isBoard.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + canVote.hashCode()
        result = 31 * result + canReport.hashCode()
        result = 31 * result + canShare.hashCode()
        result = 31 * result + authorId
        result = 31 * result + (photo?.hashCode() ?: 0)
        result = 31 * result + (background?.hashCode() ?: 0)
        return result
    }
}

data class PoolAnswers(
    val id: Int = 0,
    val text: String = "",
    val votes: Int = 0,
    val rate: Int = 0
)

data class PoolBackground(
    val id: Int = 0,
    val type: String = "",
    val angle: Int = 0,
    val color: String = "",
    val width: Int = 0,
    val height: Int = 0,
)


