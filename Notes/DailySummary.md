DailySummary
Daily Work Done - Aidan Garske

05/20/24 - Monday
8 prep for work and meeting/onboarding
Zoom call from 830 to 930
-Setup email and filters
-sent introduction email
Zoom call from 10 to 11
-Engineering meeting
Lunch after 11 to 12
Filled out agreement forms
Signed up for June 6th VSC webinar
Setup work accounts, Skype, Zoom, slack
Meeting from 2 to 4
-Crypto intro
-Questions
Worked 8 to 4:20
720 worked

05/21/24 - Tuesday
8 prep for work and meeting/onboarding
Intern meeting 830-930
-SSLTLS protocol
-setup vim and Wireshark demo
General meeting from 10 to 11
Lunch back 12:30
Zoom12:30 - 4
-wireshark
-git setup
-Git tutorial in T
-started coverage gcov
Back 6-8
Ran and debugged the DHKEM_X448_HKDF_SHA512 For the hpke.c file. Found that x448 was not being implement and that’s the reason for the LCOV returning a un-hit red section for all the DHKEM_X448_HKDF_SHA512. Either we delete the code with that in it or we copy paste the whole thing in there and fix each spot the x488 is excluded.
Signed up for the patches and linked accounts for deposit.
Hours worked
830 worked

5/22/24 - Wednesday
8 to 830 prep for zoom and work
Onboarding 830 to 9
-terminal command overview
-wolfssl-examples server client connection
Onboarding tpm 9 to 10
-Went over tpm and implementations
10 to 1030 reviewed and break
1030 call for 11
11 to 12 worked with David on rcov
Lunch
12:50 started zoom - 2
-implemented wolfclu
-implemented more git training
2 to 430
-worked on the first assignment and got pull request going.
-Finished pull request!
8 hours worked.

5/23/24 - Thursday
8 to 11 onboarding
-jenkins setup
-SSH tutorial
11-1150 lunch
11:50-5
-change pr for jacks and mine to just mine.
-maybe try documentation
Removed duplicate test #7570
Got gcov report to run better
Gcov report:
file:///Users/aidangarske/wolfssl/coverage/index.hpke.c.a55f1d3c9244bd2266c2fbdf8aba3ae2.html
Ended up doing pull request for a doc fix on SSL tutorial.
PR documentation correction chaper11.md SSL tutorial #125 completed5
810 worked

5/24/24 - Friday
Zoom call training 8-10
-ssl tutorial
-SHM walkthrough
10-11
-Tinkered with SSL-tutorial-2.4
-Doc change on SSL tutorial with updated 2.4 link and output
Lunch 11-12
Zoom call training 12-2
Walked through SMH and the Mkbook for it
3-5
-Contributed changes to Bretts main:wolfHSM-docs
-ran server for SSL walkthrough
-wolfssl tuning guide
8 worked

Week hours: 40 hrs

Week 2

Tuesday - 5/28/24
8-9  - pull request complete: Grammar fix on the README.md for wolfhsm. #35
9-10 - Zoom call about the next project with David
ARM MbedTLS WolfSSL comparison and documentation
10-11- company meeting
11-12 lunch
12 - 2
ARM MbedTLS WolfSSL comparison and documentation
2-3
Support power hour
2-5
ARM MbedTLS WolfSSL comparison and documentation
Completed mbed and wolf compilation and running documentation.
8 worked

Wednesday - 5/29/24
8-930 - ALAC started and completed got output for server client wolfish-examples POSIX
930-11 - Grammer check and rewrite for HSM CH 2,3,4
Wording, grammar fix for chapters 2,3,4 of wolfHSM-docs.
Complete changes: spelling_grammar_changes_CH.2,3,4 #2
11-12 meeting with Brett going over HSM
12-130 lunch
130-5
-work on ARM MbedTLS WolfSSL comparison and documentation
-template for HSM book conversion
-230-3 HSM meeting jack, ruby
-server outline started finished
-worked on todos on HSM
730 worked

Thursday - 5/30/24
8-10
-arm mbed tls comparison spreadsheet comparison
10-11 support power hour
11-1130
-arm mbed tls comparison spreadsheet comparison sidebyside imp
1130-12 lunch
12-430
-created shared doc for WolfHSM-docs-Fork for Ruby, Jack, and I
-arm mbed tls comparison spreadsheet comparison mostly completed
-Chapter 8 porting work reasrech and todo chapter 2 why choose hsm
8 worked

Friday - 5/31/24
8-11
-arm mbed tls comparison spreadsheet comparison sidebyside imp
-Intel core comparison and graph completion
11-1130 lunch
1130-5
-chapter 8 porting work
-chapter 1 intro why choose complete
pay Invoice
-weekly summary
Worked 830

Hours worked 32

Week 3

Monday - 6/3/24
8-11
Pr #7 bigbretts branch
Raspberry Pi 5 setup for comparison
Ran wolfssl on pi
11-1130 lunch
1130-3
Porting work
3-4
engineering meeting
3-340
Arm mbed comp
7-730
Worked 840

Tuesday - 6/4/24
8-10
Arm mbed tls comparison raspberry pi
10-11
Team meeting
11-1115 lunch
1115-415
Worked on transferring the manual over with ruby
130-230 meeting with lealem
Also with jack and ruby deciding game plan.
730-10
Finished the wolfhsm-docs to wolfssl-documentation transfer
https://github.com/wolfSSL/documentation/pull/131
Also done with raspberry pi comparison moving onto the nRF5340
Hours worked 1030

Wednesday - 6/5/24
Gone for student orientation

Thursday - 6/6/24
8-9
Merge pull request #131 from aidangarske/wolfhsm-docs complete
9-10
Embedded mcu
10-11 sph
11-12 lunch
12-4
Worked on implementing PSoC 62S2 ARM Cortex-M4 150MHz
For mbed comparison need to figure out the mbed version which will be much harder than wolf
7-8
Comp got the wolfssl running and on sheets
Worked 8 hours

Friday - 6/7/24
8-11
Arm mbed tls comp more work on benchmark
11-1130 lunch
1130-430
Arm mbed comp made outline for blog post and got both benchmarks need forerun ours with faster settings.
Weekly report
8 hours worked

Weekly hours 35 hours 10mins

Week 4

Monday - 6/10/24
10-11 eng meeting
11-12 lunch
8-5
wolfSoFT up and running found the macros for wolfssl
Made a comparison spreadsheet between documented and undocumented macros
Got some input and updated _SOCKLEN_T, NO_FORCE_SCR_SAME_SUITE,
8 worked

Tuesday -6/11/24
10-11 company meeting
11-12 lunch
8-5
Worked all day on updating the spreadsheet with all the macros I could find and
there descriptions will update all 500 for doc purposes and implementation. But will do a final check to see which ones will go in to the docs.
About 200 descriptions done for macros.
8 worked

Wednesday - 6/12/24
8-5
11-12 lunch
Got all macros in a communal spreadsheet in wolfssl engineering shared drive in hopes it can be continually updated as macros are added for sufficient documentation.
8 hours worked

Thursday - 6/13/24
8-6
10-11 SPH
11-1 lunch
Implementing macros in wofssl documentation.
8 hours worked

Friday - 6/14/24
8-400
1230-1
Wrap up wolfssl doc macros.
PR- Updated and added new macros in chapter 02, Features Defined as C Pre-processor Macro. #139
Wrap up mbed comp blog post outline.
https://docs.google.com/document/d/1gkUb42Jzo8Lc7qAQ-tGJGrQuKboaVlhmvcBL8EwwRno/edit
End of week email.
 730 worked

39 hours 30 mins

Week 5

Monday -
10-11 engineering meeting
11-15 lunch 430-445 lunch
8-430
Wrapped up pr #139 and fixed loose ends
Crypto callback for SHA3
Meeting with David about this weeks assignment.
815 worked

Tuesday - 6/18/24
10-11 company meeting
11-1 lunch
8-6
SHA3 crypto callback.
8 worked

Wednesday - 6/19/24
OOO

Thursday - 6/20/24
10-11 SPH
11-1140 lunch
730 - 420
Wrap up crypto callback for sha3
PR - Added crypto callback for SHA3. #7670
810 worked

Friday - 6/21/24
11-1115 lunch
730-355 worked
Updated mbed comp first slide and commented esspresif comp slide.
Pr status - Updated and added new macros in chapter 02, Features Defined as C Pre-processor Macro. #139
Pr status - Added crypto callback for SHA3. #7670 - MERGED
Worked 810 hours

32:35 worked

Week 6

Monday - 6/24/24
11-1230
8-530
Started the support for SHA512 in deterministic ECC also
Made ecc_sign_determinsitic test case
Worked 8

Tuesday - 6/25/24
10-11 company meeting
2-3 SPH
11-1130 lunch
8-430
Added ecc_sign_determinsitic test case but for
SECP256R1 for 256, 348, 512 got matching sample keys
SECP384R1 and for 256, 348, 512
Worked 8

Wednesday - 6/25/24
8-430
30 lunch
SECP384R1 and for 256, 348, 512
Worked 8

Thursday - 6/26/24
Lunch 11-1130
SPH 10-11
8-4
Worked 730


Friday - 6/27/24
8-530
11 1130 lunch
830

Got the ecc_test_deterministic_k, ecc384_test_deterministic_k, and ecc521_test_deterministic_k test to run on ./wolfcrypt/test/testwolfcrypt test.c.
They were not previously running because of a misused  macro `&& (!defined(FIPS_VERSION_GE) || FIPS_VERSION_GE(5,3))` which made the tests get skipped.
I added ecc.c changes to add support in ecc_sign_determinsitic.c for SHA256, SHA384, and SHA512 for SECP256R1, SECP384R1, SECP521R1. PR will be submitted Monday.

Worked 40 hours

 146.75 for June

Week 7

Monday - 7/1/24
11-1130 lunch
3-4 engineering meeting
8 - 430 worked
Wrapped up pr for deterministic k
Started work on PKCS7 PEM support
Worked 8

Tuesday - 7/2/24
11-1130 lunch
2-3 SPH
6-3
Worked 830

Wednesday - 7/3/24
1030-11 lunch
630 - 230
730 worked

Thursday - 7/4/24
11-1130
8-2
530 worked

11-1130
8-2
Weeks work traveling thurs Friday
Week 7 work
- Add PKCS7 PEM support: "—–BEGIN PKCS7—–" and "-–END PKCS7—–" Sha3.c wc_Sha3Update and wc_Sha3Final Hash Type Change #7705
- Added PKCS7 PEM support: #7704
- pkcs7-verify.c addition for PKCS7 PEM and DER wolfssl examples. #441
- ecc_sign_determinisitic.c test for for deterministic ECDSA Prime Field for SECP256R1,SECP384R1, and SECP521R #442


Added PKCS7 PEM support and a pkcs7-verify.c wolfssl example that outputs the PEM
Added an ecc_sign_determisnitc test which gives the r and s signatures.
Sha3.c changes to

Worked 2930

Week 8

Monday - 7/8/24
8-430 worked
10-11 meeting
1-130 lunch
Worked 8

Tuesday - 7/9/24
8-430
10-11 meeting
11-1130 lunch
2-3 SPH
Worked 8

Wednesday - 7/10/24
8-430
Lunch
11-1130
Worked 8

Thursday - 7/11/24
8-430
Lunch 11-130
10-11 SPH
Worked 8

Friday - 7/12/24
Worked 5 hours

Total 37 hours

Tuesday - Friday
Blog post Blog wolfSSL - How Does Our Server Order The Server Side Cipher List?
https://docs.google.com/document/d/1-FsdlHz3cHOi_piNmdVD1LG_9xojmTdfsD5yZKPUxjc/edit

Monday
Pr #441
Added pkcs7-verify verification of matching output and .p7b
added DER to PEM check  wc_DerToPem.

Week 9

Monday - 7/15/24
8-410
10-11 eng
12-1230 lunch
Worked 740
Blog post Mbed TLS and cipher Suite

Tuesday - 7/16/24
8-430
10-11 company meeting
11-1130 lunch
Worked 8 hours
Hash Type selection changes to ecc.c #7700

Wednesday - 7/17/24
8-400
11-1130 lunch
Worked 730 hours

Thursday - 7/18/24
8-430
10-11 SPH
11-1130 lunch
Worked 8 hours

Friday - 7/19/24
8-400
11-1130 lunch
Worked 730 hours

3840 worked

Week 10

Monday - 7/22/24
745-415
Eng meeting 10-11
Lunch 11-1130
Worked 8 hours

Tuesday - 7/23/24
8-430
Team meeting 10-11
Lunch 11-1130
SPH 2-3
Worked 8 hours

Wednesday - 7/24/24
8-430
Lunch 11-1130
Worked 8 hours

Thursday - 7/25/24
8-430
SPH 10-11
Lunch 11-1130
Worked 8 hours

Worked 32 hours

Week 11

Monday 7/29/24
8-6
Team meeting 10-11
Lunch 11-2
Worked 8 hours

Tuesday 7/30/24
8-430
Team meeting 10-11
Lunch 11-1130
SPH 2-3
Worked 8 hours

Wednesday - 7/31/24
8-430
Lunch 11-1130
Worked 8 hours

Thursday - 8/1/24
8-430
Lunch 11-1130
ED25519 wolfCLU DER to PEM support and sign-verify support with PEM format key ED25519
Got the genkey section working correctly stored and transferred keyFileSz. Passes all ./wolfssl ED25519 tests.
Started work on RSA genkey implemented pattern from ED25519.
Worked 8 hours

Friday - 8/2/24
9-530
RSA genkey implementation complete
Lunch 12-1230
RSA sign implemented working.
RSA verify start work - implemented `wolfCLU_verify_signature_rsa` and `wolfCLU_generate_public_key_rsa`
 functions to support verify for RSA. Still failing verify sig…
Worked 8 hours

Total hours:

Week12

Monday 8/5/24
8-430
Team meeting 3-4
Lunch 12-1230
Worked 8 hours
RSA keygen, sign and verify DER and PEM
Got the verify working in the morning and started on the ecc
Worked 8

Tuesday 8/6/24
8-430
Team meeting 10-11
Lunch 12-1230
SPH 2-3
Worked 8 hours
ECC sign, verify changes complete
Everything passing except for pubin rsa which is the keygen.
Worked 8

Wednesday 8/7/24
8-430
Lunch 1130-1230
Got all test passing pushed work to ECC, RSA, and ED25519 sign and verify support for DER and PEM passingafter lunch spent day refactoring and making functions similar flow
and so that all resources are handled once at the bottom.
Worked 8

Thursday 8/8/24
8-430
SPH 10-11
Lunch 1230-1
Refactor cleanup for sign, verify, and genkey.
Test fix - finalOutFm may be uninitialized
Fixed warnings - disable possible NULL pointer
Refactor cleanup for mem loss.
Used f sanitize and valgrind to check men leaks.
Passes all test PR148 ready to review
Started work on raw support for the wolfCLU
genkey_setup and clu_funcs changes for raw RAW_FORM add
Worked 8

Friday 8/9/24
830-430
Lunch 12-1230
Working on adding back original functionality for raw.
Started genkey for ed25519 got the raw support added in
Worked on the sign for raw ed25519 worked on the verify and
Rewrote the structure for the verify to have raw also.
Fixed test cases for raw with rsa and looked at adding ecc
to with raw as well. There was no original functionality for that
so I did ed25519 for raw. Submitted weekly report.
Worked 8

Total Hours: 40 hours

Week13

Monday 8/12/24
8-415
Lunch 11-1130
Team meeting 10-11
Got assigned new project working on the ECIES apis for RSA
and curve25519. Had trouble with setting up the windows
development environment spending most of the second half of the day
Working with David to get a remote ssh into his machine and added
The pr that was done for ecc functionality rebased and got building to start work
On vs 2022. Started work on RSA api additions. Roughly added apis for
 wc_InitRsaKey, wc_MakeRsaKey, wc_FreeRsaKey, wc_RsaSSL_Sign, wc_RsaSSL_Verify,
 wc_RsaPublicEncrypt, wc_RsaPrivateDecrypt, wc_RsaPSS_Sign, wc_RsaPSS_Verify,
wc_RsaPSS_CheckPadding, wc_RsaPrivateKeyDecode, and wc_RsaPublicKeyDecode
Worked 7:45

Tuesday 8/13/24
8-4
Lunch 11-1115
Team meeting 10-11
SPH 2-3
Worked on adding wc_NewRsaKey and wc_RsaKey_free to wolfssl for C# wrapper
Carried over changes to develop the wc_InitRsaKey and wc_MakeRsaKey. Continued work
On the other functions and getting the API’s dialed in.
Worked 7:45

Wednesday 8/14/24
8-430
Lunch 11-1130
Added test for ECC sign, verify, import, export, and genkey. Sign isn’t passing.
Fixed RNG test passing now. Added EccVerify, EccSign, ExportPrivateKeyToDer, ExportPublicKeyToDer, and
ImportPublicKeyFromDer for ECC. Focused on testing ECC and trying to get to pass and
 tweaking test to correctly handle different hash sizes and problems with the assumed length.
Worked 8

Thursday 8/15/24
8-4
Libcurl training 10-11
It was cool to hear Daniel explain how cURL works and I got to play around with curl and the examples
Built and ran curl played with examples and followed along with his beginner curl training. Overall I think it
Was a good experience for someone who has little knowledge about curl.
Lunch 11-1130
Cloned and worked with curl to prepare for the Daniels basic lib curl training I attended this morning.
Got the ECC sign to work introduced ECC_MAX_SIG_SIZE into wolfcrypt.cs which allowed for the size of
the hash to be correctly determined and sized test is dialed in for sign. ECC verify implemented and passing.
RSA test development.. got test done started debugging and making RSA sign work. Having problems
With rsa.h not being in the .sln file - updated documentation on windows Sharp wrapper setup.
Worked 8

Friday 8/16/24
730-4
Lunch 11-1130
Added function wc_NewRsaKey in rsa.c needed a function that could allocate and make new key to
Have the function wc_MakeRsaKey be implemented. Needed to change user settings so keygen was enabled for WIN.
Added Curve25519 function outline and definition. For, wc_curve25519_make_key, wc_curve25519_shared_secret,
wc_curve25519_import_private, wc_curve25519_import_public, wc_curve25519_export_public,
wc_curve25519_export_public, and wc_curve25519_export_key_raw
Developed curve25519 test to debug/test implemented functions. Developed test to check if byte arrays are equal for verify.
Worked 8

Total hours: 39 hours 30 mins

Week14

Monday 8/19/24
8-400
Lunch 11-1130
Team meeting 10-11
Worked on trying to get the output path for wolfCrpyt-Test results .dll to output in the right spot
Ended up having to change the output path which took me a bit. Added test for API’s curve25519
Refactored the other ecc and rsa test
Added ed25519 apis and test dll not working.
Worked 730 - had to stop working to make it to my apartment complex to get a new key..

Tuesday 8/20/24
8-5
Lunch 1130-1230
Team meeting 10-11
SPH 2-3
Worked on adding new api’s for c# wrapper ed25519 instead of curve25519 for right now.
Implemented functions
Added test
Debugged rest of day trying to track down a memory leak.
Worked 8 hours

Wedenseday	8/21/24
8-430
Lunch 11-1130
Added new function in ed25519.c wc_ed25519_new. Updated the make key to use this
Implemented der format ASN.1 headers for curve25519 and ed25519. Worked on getting
Ed25519 to pass tests for import, export, etc. finished ed25519 test got passing and
Fixed functions.
Worked 8

Thursday 8/22/24
730-5
Lunch 11-1130
SPH 10-11
Today I wrapped up the ed25519 got it functioning good. Added a wc_curve25519_new function
Used to malloc a new key. And used in genkey. Added Der functions to curve25519 instead of raw
Test is already developed but I added a better one that compares the shared secrets like wolfcrypt test.c.
Pushed PR 3166
Worked 9 hours

Total hours: 32 hours 30 mins

Week15

Monday 8/26/24
Team meeting 1 hour
- Finished ed25519, curve25519 raw and Der c# wrapper support
- Starting AES-GCM wolfCrypt c# wrapper. (Ok-ta requested)
- Starting school today so will be working around 16 hours a week
250-430 - 1 hour 40mins
- Rebased and got PR3166 ready to edit agin
- added new macro wc_AesGcmNew to aes.c
Worked 2 hours 40 mins

Tuesday 8/27/24
Team meeting 1 hour
- Submitted weekly report
8pm-9pm
- Added AES_GCM DLL for wc_AesGcmNew, wc_AesFree, wc_AesGcmSetKey, wc_AesGcmEncrypt, wc_AesGcmEncrypt.
Worked 2 hours

Wednesday 8/28/24
1030-11 - 30 mins
- Added wc_AesFree, and started work on wc_AesGcmNew function.
1-330 - 2 hours 30 mins
- Added AesGcmSetKey and AesGcmInit functions.
- Started wc_AesGcmEncrypt and AesGcmDecrypt
- Started test case development for functions
Worked 3 hours

Thursday 8/29/24
8-5
Lunch 11-1130
SPH 10-11
- Refactored / fixed wc_AesGcmNew making wc_AesNew
- Finished wc_AesGcmEncrypt and AesGcmDecrypt
- Made the test case for 256 bit and modeled off test.c test.
- Refactored / fixed AesNew and AesGcmSetKey c# functions
- Fixed AesGcmInit didn’t add to test case though (for STREAMING)
- PR #148 merged
- Refactor / Fixes for AES-GCM decrypt / encrypt / init / new commit
Worked 830

Friday 8/30/24
10-1015
-pushed and checkout new branch csharp_wolfcrypt2
11-12
-added dll for hash functions and started functionality
Worked 1h 15m

Saturday 8/31/24
Worked
12-1
- Added new function wc_HashNew
- Added wolfCrypt.cs func wc_HashType
4-640
- Added all dll’s for functions
- Fixed the HashNew call making sure that the pointers to the union was properly handled for each scenario
- Added rough outline for hash functions and wc_HashNew and wc_HashFree
- Debugged investigated ‘type’ not being initialized for HASH function wc_HashNew I am adding.
Worked 3 hours 40 mins

Total hours: 19 hours 50 mins

Tuesday 9/3/24
10-11 1 hour worked
Team meeting:
- Weekly report for last week
- Caught up on changes to PR #3166
- Has something to do with the function having a variable with a union which needs a specified area.
- Fixed the hash type selection and `type` initialization.
Worked 1h

Wednesday 9/4/24
2-3
- Had machine problems needed reboot and stash changes got deleted
- Got new version of branch and everything reverted to last changes
- Ready for tomorrow to finish HASH functions.
Worked 1h

Thursday 9/5/24
8-12
- Added functionality for wc_HashInit, wc_HashUpdate, and wc_HashFinal
- Added test case for `wolfCrypt-Test.cs` test hash_test which can test any hash type thanks to the hashType function
- Figured out how to get the hash type from the actual enum.
- Added the test for SHA-256, SHA-384, SHA-512, and SHA3-256
- Got all functions refactored tested and working to output the result and size.
- Pushed changes to PR#3166
10-11
- cURL command line training
12-1230 lunch
1230-5
- New assignment meeting with David going to do ECIS
- Found test example in test.c to mimic
- Added public enums for ecEncAlgo, ecKdfAlgo, ecMacAlgo, ecFlags
- Added dll for all the ecc.h HAVE_ECC_ENCRYPT functions
- Added functionality layout for all the HAVE_ECC_ENCRYPT functions.
Worked 8h 30m

Saturday 9/7/24
11-2
- Added all functionality for the functions in HAVE_ECC_ENCRYPT
- Added ecies_test based off the ecc_ctx_kdf_salt_test test.
- Debugged / troubleshoot / refactor functions…
Worked 3h

Sunday 9/8/24
10- 12
- Debugged more got the salt and init passing just need to figure out the encrypt
- Something minor is wrong with the buffer size.
- Weekly report
Worked 2h

Worked: 15h 30m

Monday 9/9/24
10-11
- Weekly engineering meeting
- This weeks goals - Finish ECIES / New project
- Blog post on the new CSharp wrapper implementation
120- 320
- Started debugging the ecies encrypt function
- Made changes because ref can’t be passed into the wrapper for encrypt and decrypt
- Investigated -132 error for encrypt refactored and updated the init ctx to have one interchangeable cox init function rather than needing to call the _ex
Worked 3h 20m

Tuesday 9/10/24
8-840
- Got the encrypt passing the plaintextLen needed to be calculated differently so it was too small.
- Developed the calculation for the size and got passing.
10-11
- Team meeting
Worked 1h 40m

Wednesday 9/11/24
1020-2
- Debugging decrypt function was getting -140 error fixed encrypt and now its getting -1
- Added debugging statements all over wolfssl ecc.c to figure the problem out
- -1 was something to do with vs and not the code tried on mono vsc and worked
- Refactored cleaned up the code fixed some more test issues squashed and pushed to PR
3h 40m

Thursday 9/12/24
8-5
- -1 still being an issue. Did more refactor on test.c ecc_ctx_kdf_salt_test adding MAX_ECIES_TEST_SZ macro
- Added this also to the wrapper test which fixed -132 error.
- Adressed comments from David made EciesGetOwnSalt return byte[] instead of IntPtr
- Updated README.md
- Fixed line length errors.
SPH 10-11
- After lunch I investigated the -1 error with David
- Started writing draft for blog post on Sharp wrapper
- Fixed issues with decryptLen not being used in test.
- Finished reactor
- Wrote blog post draft
- Added ecc_shared_secret for ecdhe
- Added test for this
Lunch 12-1230
Worked 830

Friday 9/13/24
11-1
- Tested wolfcrypt csharp wrapper on local make check rather than windows
- TODO add rng so it can be passed in rather than created in the context
- Added rng to EccMakeKey and EcdheSharedSecret
- Refactored functions fixed test for the ecdhe shared secret so ring passed in
- Added EccSetRng function

Saturday 9/14/24
6-8
- Fixed up blog post all ready for review
- Wrote weekly report
- Fixed -236 ring error and added EccSetRng to EcdheSharedSecret
- All test passing refactor should be done addressed davids comments on pr.

Worked: 20h 40m

Monday 9/16/24
10-11 team meeting

Tuesday 9/17/24
10-11 team meeting
- Pushed and did changes for ecc.c error on pr possible null pointer
3-4
- Added newline in include.am…
- Did some research on new project tiny-AES for zd 3887 seems like WOLFSSL_AES_SMALL_TABLES takes care of these operations
- Should reply to them with the correct information somehow
- Research on finding new task
- Got new assignment 2) wolfSSH support for using TPM based private key for authenticating (instead of using .ssh/id_rsa private key, use one based in TPM). is outdated and needs updated. https://github.com/wolfSSL/wolfssh/pull/342
7-9
- Built cloned and pulled wolfish
- Built cloned and pulled wolfTPM
- Pulled over changes from pr 342
- Merging is to difficult because pr is too old need to manually add changes
Worked 4 hours

Wednesday 9/18/24
1040-1140
- Made changes to blog based on input I got should be ready to post
- Started manually adding changes to

1-3
- Configure.ac for tpm support
- Client.c
- Include.am
- Internal.c added SSH RSA support for TPM
- Ssh.c changes added wolfSSH_SetTpmDev, wolfSSH_SetTpmKey, wolfSSH_GetTpmDev, wolfSSH_GetTpmKey
- Internal.h macro addition
- Ssh.h added macros and enums
- - common.c rewrote the tpm stuff
Worked 3 hr

Thursday 9/19/24
8 - 230 had to run to a dentist appointment wasn’t able to continue working after.
- Started adding code to common.c
SPH 10-1110
- Changed over client.c code imp for tpm and implemented in common.c
- Fixed build errors added changes for TPM_ALG_SHA1 parameter function
Lunch 12-1230
- Started testing / debugging issues also
-  updated readme with information on how to run the tpm and ssh server client provided key auth
Worked 6hrs

Friday 9/20/24
11-1
- Added tests to test.c for HashNew and AesNew

Worked: 16hr

Monday 9/23/24
10-11 team meeting
- updated spreadsheet for tasks
- Sent out wrote weekly report for last week
12-3
- Debugged fixed the test.c implementation for AesNew and hashNew got help from David on the hash operations.
Worked 4 hours

Tuesday 9/24/24
10-11 team meeting
11-1
- AesNew / Init refactor / code reduction for test.c
- Fix for pdf salt for test.c
Worked 3 hours

Wednesday 9/25/24
10-11
Everything FIPS 140-3
Worked 1 hour

Thursday 9/26/24
8-10
- Call with David figuring out next steps with ssh tpm auth key support
- Fixed issue with tpm options.h not being included
- Going to figure out how to use ssh client key auth without tpm first
10-11 SPH
- Ran the echo server cline connection with public key authentication
- Watched webinar for ssh 2024 followed along
11-1115 lunch
1115-445
- Got the cl commands to function so I can start debugging
- Started testing functionality
- More small edits to get things sorta working
- will need to pass
- Updated readme with detailed steps on debug and run and dependencies
Worked 830h

Worked 16h 30m

Monday 9/30/24
8-830 30m
- Sent weekly report
- Updated project schedule
- Caught up on emails
10-11 1h
team meeting
- Finsished C# wolfCrypt wrapper and finish adding test coverage for `wc_AesNew` and `wc_HashNew`
- Familiarized / tested wolfSSH public key authentication
-  debug /tested wolfSSH with TPM based public key authentication
-  updated readme
1120-150 2h 30m
- Set up environment for testing agin
- Debugged tested client side server side is still trying t connect need to have only client connection
- Added more debug statements to help me out finding that tpmDev and tpmKey are likely not being used correctly
- Function failing SendKexDhReply - singH - SingHRsa "SendKexDhReply: TPM key or device not set"); internal.c
- Disabled sign the sign for rsa conditionally
Worked 4h

Tuesday 10/1/24
SUBMIT PAY STUB!

Worked 4h