package com.namratha.campuseventexplorer.data

//sample events stored locally, not in db
object EventRepository {
    val events = listOf(
        CampusEvent(
            id = 102L,
            title = "Movie Night",
            category = "Social",
            location = "BU Central",
            time = "October 22, 7:00 PM",
            description = "Join us for a movie night on campus. Snacks and drinks will be provided."
        ),
        CampusEvent(
            id = 103L,
            title = "Resume Review Session",
            category = "Career",
            location = "Yawkey Center",
            time = "October 23, 2:00 PM",
            description = "Bring a copy of your resume and get feedback before applying for internships or jobs."
        ),
        CampusEvent(
            id = 104L,
            title = "Study Break with Therapy Dogs",
            category = "Wellness",
            location = "George Sherman Union",
            time = "October 24, 1:00 PM",
            description = "Take a break from classes and spend some time with therapy dogs. Drop in whenever you have time."
        ),
        CampusEvent(
            id = 105L,
            title = "International Food Festival",
            category = "Cultural",
            location = "GSU Metcalf Hall",
            time = "October 26, 5:00 PM",
            description = "Try food from different countries and learn about the cultures represented by student groups on campus."
        ),
        CampusEvent(
            id = 101L,
            title = "Fall 2026 Career Fair",
            category = "Career",
            location = "George Sherman Union",
            time = "October 28, 11:00 AM",
            description = "Stop by the fall career fair to meet employers, learn about job openings, and ask questions about internships and full time positions."
        ),
        CampusEvent(
            id = 106L,
            title = "Halloween Costume Party",
            category = "Social",
            location = "BU Central",
            time = "October 30, 7:00 PM",
            description = "Come dressed in your Halloween costume for a night of music, games, and snacks."
        ),
        CampusEvent(
            id = 107L,
            title = "Research Opportunities Info Session",
            category = "Academic",
            location = "CAS 211",
            time = "November 3, 4:00 PM",
            description = "Learn how to get involved in undergraduate research at BU, find faculty projects, and apply for research opportunities."
        ),
        CampusEvent(
            id = 108L,
            title = "Board Game Night",
            category = "Social",
            location = "George Sherman Union",
            time = "November 5, 6:00 PM",
            description = "Spend the evening playing board games with other students. Feel free to bring your own games."
        )
    )

    fun findById(id: Long): CampusEvent? = events.firstOrNull { it.id == id }
}
