package com.kotlinextension.networking.model.success

import com.google.gson.annotations.SerializedName

data class ResSearchRepo(
	@SerializedName("total_count") val totalCount: Int? = 0,
	@SerializedName("incomplete_results") val incompleteResults: Boolean? = false,
	@SerializedName("items") val items: List<Item>? = listOf()
)

data class Item(
	@SerializedName("id") val id: Int = 0,
	@SerializedName("name") val name: String? = "",
	@SerializedName("full_name") val fullName: String? = "",
	@SerializedName("owner") val owner: Owner? = Owner(),
	@SerializedName("private") val private: Boolean? = false,
	@SerializedName("html_url") val htmlUrl: String? = "",
	@SerializedName("description") val description: String? = "",
	@SerializedName("fork") val fork: Boolean? = false,
	@SerializedName("url") val url: String? = "",
	@SerializedName("forks_url") val forksUrl: String? = "",
	@SerializedName("keys_url") val keysUrl: String? = "",
	@SerializedName("collaborators_url") val collaboratorsUrl: String? = "",
	@SerializedName("teams_url") val teamsUrl: String? = "",
	@SerializedName("hooks_url") val hooksUrl: String? = "",
	@SerializedName("issue_events_url") val issueEventsUrl: String? = "",
	@SerializedName("events_url") val eventsUrl: String? = "",
	@SerializedName("assignees_url") val assigneesUrl: String? = "",
	@SerializedName("branches_url") val branchesUrl: String? = "",
	@SerializedName("tags_url") val tagsUrl: String? = "",
	@SerializedName("blobs_url") val blobsUrl: String? = "",
	@SerializedName("git_tags_url") val gitTagsUrl: String? = "",
	@SerializedName("git_refs_url") val gitRefsUrl: String? = "",
	@SerializedName("trees_url") val treesUrl: String? = "",
	@SerializedName("statuses_url") val statusesUrl: String? = "",
	@SerializedName("languages_url") val languagesUrl: String? = "",
	@SerializedName("stargazers_url") val stargazersUrl: String? = "",
	@SerializedName("contributors_url") val contributorsUrl: String? = "",
	@SerializedName("subscribers_url") val subscribersUrl: String? = "",
	@SerializedName("subscription_url") val subscriptionUrl: String? = "",
	@SerializedName("commits_url") val commitsUrl: String? = "",
	@SerializedName("git_commits_url") val gitCommitsUrl: String? = "",
	@SerializedName("comments_url") val commentsUrl: String? = "",
	@SerializedName("issue_comment_url") val issueCommentUrl: String? = "",
	@SerializedName("contents_url") val contentsUrl: String? = "",
	@SerializedName("compare_url") val compareUrl: String? = "",
	@SerializedName("merges_url") val mergesUrl: String? = "",
	@SerializedName("archive_url") val archiveUrl: String? = "",
	@SerializedName("downloads_url") val downloadsUrl: String? = "",
	@SerializedName("issues_url") val issuesUrl: String? = "",
	@SerializedName("pulls_url") val pullsUrl: String? = "",
	@SerializedName("milestones_url") val milestonesUrl: String? = "",
	@SerializedName("notifications_url") val notificationsUrl: String? = "",
	@SerializedName("labels_url") val labelsUrl: String? = "",
	@SerializedName("releases_url") val releasesUrl: String? = "",
	@SerializedName("deployments_url") val deploymentsUrl: String? = "",
	@SerializedName("created_at") val createdAt: String? = "",
	@SerializedName("updated_at") val updatedAt: String? = "",
	@SerializedName("pushed_at") val pushedAt: String? = "",
	@SerializedName("git_url") val gitUrl: String? = "",
	@SerializedName("ssh_url") val sshUrl: String? = "",
	@SerializedName("clone_url") val cloneUrl: String? = "",
	@SerializedName("svn_url") val svnUrl: String? = "",
	@SerializedName("homepage") val homepage: String? = "",
	@SerializedName("size") val size: Int? = 0,
	@SerializedName("stargazers_count") val stargazersCount: Int? = 0,
	@SerializedName("watchers_count") val watchersCount: Int? = 0,
	@SerializedName("language") val language: String? = "",
	@SerializedName("has_issues") val hasIssues: Boolean? = false,
	@SerializedName("has_projects") val hasProjects: Boolean? = false,
	@SerializedName("has_downloads") val hasDownloads: Boolean? = false,
	@SerializedName("has_wiki") val hasWiki: Boolean? = false,
	@SerializedName("has_pages") val hasPages: Boolean? = false,
	@SerializedName("forks_count") val forksCount: Int? = 0,
	@SerializedName("mirror_url") val mirrorUrl: Any? = Any(),
	@SerializedName("archived") val archived: Boolean? = false,
	@SerializedName("open_issues_count") val openIssuesCount: Int? = 0,
	@SerializedName("license") val license: Any? = Any(),
	@SerializedName("forks") val forks: Int? = 0,
	@SerializedName("open_issues") val openIssues: Int? = 0,
	@SerializedName("watchers") val watchers: Int? = 0,
	@SerializedName("default_branch") val defaultBranch: String? = "",
	@SerializedName("score") val score: Double? = 0.0
)

data class Owner(
	@SerializedName("login") val login: String? = "",
	@SerializedName("id") val id: Int? = 0,
	@SerializedName("avatar_url") val avatarUrl: String? = "",
	@SerializedName("gravatar_id") val gravatarId: String? = "",
	@SerializedName("url") val url: String? = "",
	@SerializedName("html_url") val htmlUrl: String? = "",
	@SerializedName("followers_url") val followersUrl: String? = "",
	@SerializedName("following_url") val followingUrl: String? = "",
	@SerializedName("gists_url") val gistsUrl: String? = "",
	@SerializedName("starred_url") val starredUrl: String? = "",
	@SerializedName("subscriptions_url") val subscriptionsUrl: String? = "",
	@SerializedName("organizations_url") val organizationsUrl: String? = "",
	@SerializedName("repos_url") val reposUrl: String? = "",
	@SerializedName("events_url") val eventsUrl: String? = "",
	@SerializedName("received_events_url") val receivedEventsUrl: String? = "",
	@SerializedName("type") val type: String? = "",
	@SerializedName("site_admin") val siteAdmin: Boolean? = false
)
