# scala-oss.g8

[g8](https://github.com/n8han/giter8) template for creating an open-source Scala project.  Running g8 against this project will generate a skeleton Scala project suitable for open source.  See this [tutorial](http://proseand.co.nz/2014/02/24/oss-scala-starter-kit/) for more details.

## Generating project

Install giter8 (g8) - See [readme](https://github.com/n8han/giter8#readme) for more information.

Install SBT 0.13 - See [setup](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) for more information.

In a shell/console, run the following in the parent directory of the new project:

```
g8 barnesjd/scala-oss
```

You will be prompted for the following values.  Defaults are in `[brackets]`.  Descriptions appear after `#` comments:

```
name [Scala OSS]:                                       # Name of your open source project
organization [org.example]:                             # Name of your organization's domain
package [org.example.scalaoss]:                         # Name of the base package for the project
developer_name [Git Hubber]:                            # Your name
github_id [githubber]:                                  # Your github ID
project_url [https://github.com/githubber/scala-oss]:   # The home URL for your OSS project
developer_url [https://github.com/githubber]:           # Your home URL
```

After running the script, you have a project that is ready to build, test, package, and publish to Sonatype.

## Project Usage

Change directories to the directory created by `g8` and run `sbt`.  The following commands are of interest:

```
> +compile        # Cross-compiles your project into all supported Scala versions
> +test           # Tests your project using all supported Scala versions
> +osgiBundle     # Packages your project into a jar for each supported Scala version with an OSGi-compliant MANIFEST
> +publishSigned  # Publishes your artifacts (binary jars, source files, scaladocs) to Sonatype staging repo for each Scala version
```