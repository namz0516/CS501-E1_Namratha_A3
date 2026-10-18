package com.namratha.campuseventexplorer.data

/** Fixed, stable sample data; no network connection or database is required. */
object EventRepository {
    val events: List<CampusEvent> = listOf(
        CampusEvent(101L, "Mobile Development Meetup", "Technology", "CAS 214", "Tuesday, October 13 · 6:30 PM", "Meet other students interested in Android development. Share your projects, ask questions, and discuss Kotlin and Jetpack Compose."),
        CampusEvent(102L, "Fall Career Networking", "Career", "George Sherman Union", "Wednesday, October 14 · 4:00 PM", "Connect with alumni and employers, learn about internships, and practice introducing yourself in a welcoming environment."),
        CampusEvent(103L, "Campus Movie Night", "Entertainment", "Metcalf Hall", "Friday, October 16 · 7:00 PM", "Relax after class with a movie screening and a casual discussion. Snacks will be available while supplies last."),
        CampusEvent(104L, "Data Science Workshop", "Technology", "MCS B33", "Monday, October 19 · 5:00 PM", "A beginner-friendly workshop on exploring datasets with Python, Pandas, and simple visualizations. Bring your laptop."),
        CampusEvent(105L, "International Food Fair", "Culture", "Marsh Plaza", "Thursday, October 22 · 12:00 PM", "Discover foods and traditions shared by student organizations from around the world. Meet new people and explore campus culture."),
        CampusEvent(106L, "Wellness and Yoga Session", "Wellness", "FitRec Studio 2", "Saturday, October 24 · 10:00 AM", "Take a break from coursework with a guided stretching and yoga session suitable for all experience levels."),
        CampusEvent(107L, "Robotics Club Demo", "Technology", "ENG 105", "Tuesday, October 27 · 3:30 PM", "See student-built robots in action and learn how sensors, control software, and teamwork bring prototypes to life."),
        CampusEvent(108L, "Volunteer Community Cleanup", "Community", "BU Beach", "Sunday, November 1 · 9:00 AM", "Join fellow students for a campus-area cleanup. Supplies will be provided; wear comfortable shoes and weather-appropriate clothing.")
    )

    fun findById(id: Long): CampusEvent? = events.firstOrNull { it.id == id }
}
