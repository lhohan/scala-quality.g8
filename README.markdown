scala-quality giter8 plugin
----------

TODO: expand on motivation for this project.

A scala giter8 template with focus on quality oriented plugins.
It's mostly plugins I like using to start of projects to be able to:
- catch potential bugs sooner
- focus on what's important
- measure 'quality' from the start, so we do not have to play catch up

- `sbt -sbt-version 0.13.15 new lhohan/scala-quality.g8`

Plugins
----
- scalafmt:
  - Auto-formatting on compile is enabled.
  - Default formatting style is 'default-with-align'.
- todos: see [todos].
    - Automatically enabled on compile.
- sbt-updates: see [sbt-updates]. Common commands:
    -
- WartRemover, a flexible Scala code linting tool. See [wartremover].
    - Automatically enabled on compile.
- Linter Compiler Plugin, Linter is a Scala static analysis compiler plugin which adds compile-time checks for various possible bugs, inefficiencies, and style problems. See [linter].
    - Automatically enabled on compile.

Also configured:
- coursier: faster artifact fetching

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
[linter]: https://github.com/HairyFotr/linter
