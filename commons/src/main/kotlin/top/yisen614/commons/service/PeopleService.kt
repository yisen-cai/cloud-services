package top.yisen614.commons.service

import top.yisen614.commons.entity.People


interface PeopleService {
    fun getPeople(people: People): People
}