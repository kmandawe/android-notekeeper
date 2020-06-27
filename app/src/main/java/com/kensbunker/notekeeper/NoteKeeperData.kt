package com.kensbunker.notekeeper

class CourseInfo(val courseId: String, val title: String)

class NoteInfo(course: CourseInfo, var title: String, var text: String)