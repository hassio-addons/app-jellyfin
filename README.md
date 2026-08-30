# Home Assistant Community App: Jellyfin

[![GitHub Release][releases-shield]][releases]
![Project Stage][project-stage-shield]
[![License][license-shield]](LICENSE.md)

[![Github Actions][github-actions-shield]][github-actions]
![Project Maintenance][maintenance-shield]
[![GitHub Activity][commits-shield]][commits]

[![Sponsor Frenck via GitHub Sponsors][github-sponsors-shield]][github-sponsors]

[![Support Frenck on Patreon][patreon-shield]][patreon]

The free software media system for your movies, shows and music.

## About

[Jellyfin][jellyfin] is a media server. Point it at the folders holding your
films, series and music, and it works out what everything is, collects the
artwork and descriptions, and hands it all to whatever you want to watch on:
a browser, a phone, a tablet, a games console or a TV.

Nothing about it phones home. There is no account to make, no subscription and
no paid tier holding features back; the server on your own machine is the whole
product. This app runs that server next to Home Assistant, with its library
sitting in the same `media` folder the rest of your apps use.

Transcoding, for the times a device cannot play a file as it is, can be handed
to an Intel or AMD graphics chip, using the same patched FFmpeg the Jellyfin
project ships. Home Assistant's own [Jellyfin integration][integration] brings
the library into the media browser and every device playing from it in as a
media player.

[:books: Read the full app documentation][docs]

## Support

Got questions?

You have several options to get them answered:

- The [Home Assistant Community Apps Discord chat server][discord] for app
  support and feature requests.
- The [Home Assistant Discord chat server][discord-ha] for general Home
  Assistant discussions and questions.
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]

You could also [open an issue here][issue] GitHub.

## Contributing

This is an active open-source project. We are always open to people who want to
use the code or contribute to it.

We have set up a separate document containing our
[contribution guidelines](.github/CONTRIBUTING.md).

Thank you for being involved! :heart_eyes:

## Authors & contributors

The original setup of this repository is by [Franck Nijhof][frenck].

For a full list of all authors and contributors,
check [the contributor's page][contributors].

## We have got some Home Assistant apps for you

Want some more functionality to your Home Assistant instance?

We have created multiple apps for Home Assistant. For a full list, check out
our [GitHub Repository][repository].

## License

MIT License

Copyright (c) 2026 Franck Nijhof

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[commits-shield]: https://img.shields.io/github/commit-activity/y/hassio-addons/app-jellyfin.svg
[commits]: https://github.com/hassio-addons/app-jellyfin/commits/main
[contributors]: https://github.com/hassio-addons/app-jellyfin/graphs/contributors
[discord-ha]: https://discord.gg/c5DvZ4e
[discord]: https://discord.me/hassioaddons
[docs]: https://github.com/hassio-addons/app-jellyfin/blob/main/jellyfin/DOCS.md
[forum]: https://community.home-assistant.io/t/?u=frenck
[frenck]: https://github.com/frenck
[github-actions-shield]: https://github.com/hassio-addons/app-jellyfin/workflows/CI/badge.svg
[github-actions]: https://github.com/hassio-addons/app-jellyfin/actions
[github-sponsors-shield]: https://frenck.dev/wp-content/uploads/2019/12/github_sponsor.png
[github-sponsors]: https://github.com/sponsors/frenck
[integration]: https://www.home-assistant.io/integrations/jellyfin/
[issue]: https://github.com/hassio-addons/app-jellyfin/issues
[jellyfin]: https://jellyfin.org
[license-shield]: https://img.shields.io/github/license/hassio-addons/app-jellyfin.svg
[maintenance-shield]: https://img.shields.io/maintenance/yes/2026.svg
[patreon-shield]: https://frenck.dev/wp-content/uploads/2019/12/patreon.png
[patreon]: https://www.patreon.com/frenck
[project-stage-shield]: https://img.shields.io/badge/project%20stage-experimental-yellow.svg
[reddit]: https://reddit.com/r/homeassistant
[releases-shield]: https://img.shields.io/github/release/hassio-addons/app-jellyfin.svg
[releases]: https://github.com/hassio-addons/app-jellyfin/releases
[repository]: https://github.com/hassio-addons/repository
