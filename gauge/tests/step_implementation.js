/* globals gauge*/
"use strict";
const path = require('path');
const {
    openBrowser,
    write,
    closeBrowser,
    goto,
    press,
    screenshot,
    above,
    click,
    checkBox,
    listItem,
    toLeftOf,
    link,
    text,
    into,
    textBox,
    evaluate,
    button
} = require('taiko');
const assert = require("assert");
const headless = process.env.headless_chrome.toLowerCase() === 'true';

beforeSuite(async () => {
    await openBrowser({
        headless: headless
    })
});

afterSuite(async () => {
    await closeBrowser();
});

// Return a screenshot file name
gauge.customScreenshotWriter = async function () {
    const screenshotFilePath = path.join(process.env['gauge_screenshots_dir'],
        `screenshot-${process.hrtime.bigint()}.png`);

    await screenshot({
        path: screenshotFilePath
    });
    return path.basename(screenshotFilePath);
};

// step("Add task <item>", async (item) => {
//     await write(item, into(textBox("What needs to be done?")));
//     await press('Enter');
// });

// step("View <type> tasks", async function (type) {
//     await click(link(type));
// });

// step("Complete tasks <table>", async function (table) {
//     for (var row of table.rows) {
//         await click(checkBox(toLeftOf(row.cells[0])));
//     }
// });

// step("Clear all tasks", async function () {
//     await evaluate(() => localStorage.clear());
// });

// step("Open todo application", async function () {
//     await goto("todo.taiko.dev");
// });

step("open frontend application", async function () {
    await goto("http://localhost:4200");
    // gauge.screenshot();
});

step("type in username <username>", async function (username) {
    await write(username, into(textBox("username")));
    // gauge.screenshot();
});

step("type in password <password>", async function (password) {
    await write(password, into(textBox("password")));
    // gauge.screenshot();
});

step("click login button", async function () {
    await button("Login").exists().then(async function () {
        await click(button("Login"));
    });
    // gauge.screenshot();
});

step("should see <message>", async function (message) {
    assert.ok(await text(message).exists(0, 0));
    // gauge.screenshot();
});

// step("Must not have <table>", async function (table) {
//     for (var row of table.rows) {
//         assert.ok(!await text(row.cells[0]).exists(0, 0));
//     }
// });

// step("Must display <message>", async function (message) {
//     assert.ok(await text(message).exists(0, 0));
// });

// step("Add tasks <table>", async function (table) {
//     for (var row of table.rows) {
//         await write(row.cells[0]);
//         await press('Enter');
//     }
// });

// step("Must have <table>", async function (table) {
//     for (var row of table.rows) {
//         assert.ok(await text(row.cells[0]).exists());
//     }
// });