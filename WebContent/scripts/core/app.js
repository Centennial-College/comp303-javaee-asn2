/**
 * add custom javascript here
 */

/* function to show product rating using stars */
$.fn.rating = function() {
    return $(this).each(function() {
        // Get the value of rating
        var ratingVal = parseFloat($(this).html());
        // Make sure that the value is in 0 - 5 range, multiply to get width
        var size = Math.max(0, (Math.min(5, ratingVal))) * 16;
        var $span = $('<span />').width(size);
        // Replace the numerical value with stars
        $(this).html($span);
    });
}

$(function() {
    $('span.stars').rating();
});