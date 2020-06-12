package top.yisen614.cloudcommons.service

import top.yisen614.cloudcommons.entity.People


interface PeopleService {
    fun getPeople(people: People): People
}