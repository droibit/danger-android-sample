# Ignore inline messages which lay outside a diff's range of PR
github.dismiss_out_of_range_messages

# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("PR is classed as Work in Progress") if github.pr_title.include? "[WIP]"

# Warn when there is a big PR
warn("a large PR") if git.lines_of_code > 300

# ktlint
checkstyle_format.base_path = Dir.pwd
checkstyle_format.report 'app/build/reports/ktlint/ktlint-prodDebug.xml'

# AndroidLint
android_lint.gradle_task = "app:lint"
android_lint.report_file = "app/build/reports/lint-results-prodDebug.xml"
# https://github.com/loadsmart/danger-android_lint#lint-only-addedmodified-files
android_lint.filtering = true
android_lint.lint(inline_mode: true)