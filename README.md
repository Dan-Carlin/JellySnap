# JellySnap
#### Video Demo: URL TBD

#### Description
JellySnap is an Android app that is being built as my final project submission for CS50x. It is a
social app that uses Bluetooth technology to allow users to passively share a snapshot of their unique 
jelly avatars with strangers nearby, as well as exchange their jelly profiles with their friends.

#### How it works
JellySnap is meant to run in the background while you are out and about. Bluetooth discovery will run
under the hood and store the address of any nearby device that has Bluetooth currently enabled. Once
the user is ready to collect their jellies, the app will check the list of encountered devices against
a database of JellySnap users and save a snapshot of their jellies in your jelly inventory. The
unused addresses will be safely discarded from memory.

Since Bluetooth is heavily used in many features, the app will require Bluetooth permissions in order
to function properly. But part of the reason I decided to make an app like this is to learn about
Android security features and to be able to implement wireless communication between devices as safely 
as possible.

###### Jelly snapshots
A jelly snapshot, or JellySnap, will simply consist of the user's current jelly sprite, as well as a
small greeting or thought that each user can choose to share with others. Interactive functionality 
with a snapshot will be non-existent. They merely serve as a reminder that you encountered another
JellySnap user out in the world. Jelly snapshots are anonymous.

_Note:_ Since the greeting is up to the user's discretion, there is a possibility of encountering explicit
language here. Not recommended for younger users.

###### Jelly profiles
A jelly profile is essentially a jelly snapshot with more features. It is basically the equivalent of
adding a friend on social media. You will be able to open chats with your friends and share content
that you would not be able to share with snapshots.

#### The purpose of JellySnap
This app is merely something I thought would be fun to build. I'm taking inspiration from the StreetPass
Mii Plaza functionality in the Nintendo 3DS and giving Android users the chance to get a similar
experience using their phones.

JellySnap is best thought of as a possible expansion or premium feature that can be incorporated into
a larger social media app.

#### Referenced materials
Here is a list of various tutorials and documentation that I referenced to be able to implement certain
features:

| Author          | Publication Date | Title/Link                                                                                                                            | Format         |
|-----------------|:----------------:|---------------------------------------------------------------------------------------------------------------------------------------|----------------|
| Philipp Lackner |   Mar 1, 2023    | [_How to Scan for Bluetooth Devices - Building a Bluetooth Chat App for Android_](https://youtu.be/A41hkHoYu4M?si=rW8hYZ0orUlLxRkL)   | Video tutorial |
|                 |   Mar 5, 2023    | [_How to Pair & Connect Via Bluetooth - Building a Bluetooth Chat App for Android_](https://youtu.be/9dcRWtARgmk?si=ghTJPOkreG_HSsdd) | Video tutorial |
|                 |   Mar 8, 2023    | [_How to Pair & Connect Via Bluetooth - Building a Bluetooth Chat App for Android_](https://youtu.be/8ypJkxU4FCw?si=1KhntkeIFTNyomTB) | Video tutorial | 
|                 |   Feb 12, 2023   | [_The ULTIMATE Permission Handling Guide_](https://youtu.be/D3JCtaK8LSU?si=Z8GM-afpnujObHSR)                                          | Video tutorial |