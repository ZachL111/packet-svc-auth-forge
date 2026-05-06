# Packet Svc Auth Forge Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 138 | watch |
| stress | retry load | 135 | watch |
| edge | worker slack | 222 | ship |
| recovery | session drift | 126 | watch |
| stale | queue pressure | 150 | ship |

Start with `edge` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`edge` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
