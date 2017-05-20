scala-quality giter8 plugin
----------

TODO: expand on motivation for this project.

A scala giter8 template with focus on quality oriented plugins.
It's mostly plugins I like using to start of projects. Idea is to start of projects well so:
- easy to avoid potential bugs can be avoided
- focus on what's important
- we measure from the start, so we do not have to play catch up

- `sbt -sbt-version 0.13.15 new lhohan/scala-quality.g8`

Plugins
----
- scalafmt:
  - Auto-formatting on compile is enabled.
  - Default formatting style is 'default-with-align'.
- todos: see [todos].
- sbt-updates: see [sbt-updates].
- WartRemover, a flexible Scala code linting tool. See [wartremover].

Also configured:
- coursier: faster artifact fetching

To do:
- https://github.com/HairyFotr/linter

Other
------

Scala compiler warnings have been enabled and will fail compilation if there are any.
See build.sbt to change or add more. To see all possible options run `scalac` locally.

Setup
--------

All plugins are as much as possible to run on compile as much as possible.

The plugins are added to your project in `project/plugins-base.sbt` to keep them distinct from your own plugins.



Template license
----------------
Written in 2017 by Hans L'Hoest

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[todos]: https://github.com/fedragon/sbt-todolist
[sbt-updates]: https://github.com/rtimush/sbt-updates
[wartremover]: https://github.com/wartremover/wartremover
