package com.practice.point.presenter.controller

import com.practice.point.usecase.facade.PointGroupFacade
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/points/groups")
class PointGroupController(
	private val pointGroupFacade: PointGroupFacade,
) {
	fun getPointGroups() {
	}
}